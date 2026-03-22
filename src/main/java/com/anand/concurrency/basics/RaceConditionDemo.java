package com.anand.concurrency.basics;

public class RaceConditionDemo {


        static Counter counter= new Counter();
         static class MyTask implements Runnable{
            @Override
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName()+ " -> "+counter.getCount());
                }
   //                counter.increment();
            }
        }


    public static void main(String[] args) throws InterruptedException {
        MyTask task= new MyTask();

        Thread t1= new Thread(task,"race-condn-1");
        Thread t2= new Thread(task,"race-condn-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
      //  Thread.currentThread().sleep(30000);
        System.out.println("final counter -> "+counter.getCount());
    }
}
