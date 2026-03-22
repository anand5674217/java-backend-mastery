package com.anand.concurrency.waitnotify;

public class OddEvenPrinterv3 {


    private int current=1;
    private final int max;

    public OddEvenPrinterv3(int max){
        this.max=max;
    }
    public synchronized void printEven() throws InterruptedException{

        while(current<=max){
            while(current%2!=0){
                wait();
            }

            System.out.println(current+" printed by "+ Thread.currentThread().getName());
            current++;
            notify();
        }
    }

    public synchronized void printOdd() throws InterruptedException{

        while(current<=max){
            while(current%2==0){
                wait();
            }

            System.out.println(current+" printed by "+ Thread.currentThread().getName());
            current++;
            notify();
        }
    }



//    synchronized void printOdd(){
//
//        while(current<=max){
//            while(current%2==0){
//                this.wait();
//            }
//            print();
//            increment();
//            this.notifyAll();
//        }
//    }
}
