package com.anand.concurrency.basics;

public class JoinExperiment2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("child "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"woker-1");
        t1.start();
        t1.join();
        System.out.println("main finished working");
    }
}
