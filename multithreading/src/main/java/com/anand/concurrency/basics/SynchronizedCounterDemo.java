package com.anand.concurrency.basics;

public class SynchronizedCounterDemo {

    static class SafeCounter{
        int count=0;

        public synchronized void increment(){
            count++;
        }

        public int getCount(){
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException{

        SafeCounter counter = new SafeCounter();

        Thread t1= new Thread(()->{

            for(int i=0;i<10000;i++){
                counter.increment();
            }

        },"Worker-1");


        Thread t2= new Thread(()->{

            for(int i=0;i<10000;i++){
                counter.increment();
            }

        },"Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected is 20000");
        System.out.println("Actual is "+ counter.getCount());
    }
}
