package com.anand.concurrency.basics;

public class JoinExperiment1{


    public static void main(String[] args) {
        System.out.println("chal raha hai ");

        Thread t1= new Thread(()-> {
                for(int i=0;i<5;i++){
            System.out.println("child "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        },"worker-1");

        t1.start();
        System.out.println("main thread finished");
    }
}