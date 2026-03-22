package com.anand.concurrency.basics;

public class ThreadCreationDemo {

    static class MyThread extends Thread{
        @Override
        public void run(){
            for(int i=0;i<=500;i++){
                System.out.println(Thread.currentThread().getName()+ "-> value: "+i);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Main thread started "+ Thread.currentThread().getName());

        MyThread t1= new MyThread();
        t1.setName("Worker-1");


        MyThread t2= new MyThread();
        t2.setName("Worker-2");

        t1.start();
        t2.start();

        System.out.println("Main thread finished"+ Thread.currentThread().getName());
    }


}
