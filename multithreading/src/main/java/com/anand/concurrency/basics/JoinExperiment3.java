package com.anand.concurrency.basics;

public class JoinExperiment3 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main: before creating thread");
        Thread t1= new Thread(()->{
            System.out.println("child : started");
            for (int i = 0; i < 5; i++) {
                System.out.println("child "+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("child: finished");
        },"worker-1");

        System.out.println("Main: before starting thread");
        t1.start();

        System.out.println("Main: before joining thread");
        t1.join();
        System.out.println("main finished working");
    }
}
