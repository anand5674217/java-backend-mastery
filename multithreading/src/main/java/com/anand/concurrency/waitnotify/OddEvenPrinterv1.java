package com.anand.concurrency.waitnotify;

public class OddEvenPrinterv1 {

    static class Counter{
        int count=0;

        public synchronized void increment(){
            count++;
        }

        public int getCount(){
            return count;
        }
    }

    public static void main(String[] args) {


        Thread t1= new Thread(()-> {

            for(int i=1;i<10;i+=2){
                //System.out.println(i+ " printed by "+Thread.currentThread().getName());
                try {
                    print(i,Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        },"odd printing thread");


        Thread t2= new Thread(()-> {

            for(int i=0;i<10;i+=2){
               // System.out.println(i+  " printed by "+Thread.currentThread().getName());
                try {
                    print(i,Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        },"even printing thread");


        t1.start();
        t2.start();

    }

    static synchronized void print(int i, String name) throws InterruptedException {
        System.out.println(i+  " printed by "+name);
     }
}
