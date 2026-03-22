package com.anand.concurrency.basics;

public class  RunnableDemo {

    static class MyTask implements Runnable{
        @Override
        public void run(){
            for(int i=0;i<=10;i++){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+ " -> task value: "+ i);
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Main thread started "+ Thread.currentThread().getName());


        MyTask task= new MyTask();

        Thread t1= new Thread(task,"Runnable-worker-1");
        Thread t2= new Thread(task,"Runnable-worker-2");

        t1.start();
        t2.start();

        System.out.println("Main thread finished "+ Thread.currentThread().getName());
    }
}
