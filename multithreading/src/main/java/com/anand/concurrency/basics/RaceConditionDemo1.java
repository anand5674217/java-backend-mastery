package com.anand.concurrency.basics;

public class RaceConditionDemo1 {

    public static void main(String[] args) throws InterruptedException{


        Counter counter= new Counter();

        Thread t1= new Thread(()-> {

            for (int i = 0; i < 100001; i++) {
                counter.increment();
            }

        },"Worker-1");

        Thread t2= new Thread(()-> {

            for (int i = 0; i < 100001; i++) {
                counter.increment();
            }

        },"Worker-1");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected count: 20000");
        System.out.println("Actual count : "+counter.getCount() );

    }
}
