package com.anand.concurrency.basics;

public class LambdaThreadDemo {

    public static void main(String[] args) {
        Thread t1= new Thread(()->{
                for (int i=0;i<=5;i++){
                    System.out.println(Thread.currentThread().getName()+ " -> "+i);
                }
        },"Lambda-Worker-1");
        t1.start();
    }
}
