package com.anand.concurrency.waitnotify;

public class OddEvenPrinterv2 {

    public static void main(String[] args) {


int count=0;
        Thread t1= new Thread((new Counter(count)),"odd printing thread");
        Thread t2= new Thread(new Counter(count),"even printing thread");

        for (int i = 0; i < 10; i++) {
           // Thread t1= new Thread((new Counter(i)),"odd printing thread");
          //  Thread t2= new Thread(new Counter(i),"even printing thread");
            if(i%2!=0){
                t1.start();
            }else{
                t2.start();
            }
        }

    }

    static class Counter implements Runnable{

        int count=0;
        public Counter(int c){
            count=c;
        }
        @Override
        public void run(){
            System.out.println(count+" printed by "+ Thread.currentThread().getName());
        }
    }
}
