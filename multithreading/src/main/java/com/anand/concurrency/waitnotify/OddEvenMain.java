package com.anand.concurrency.waitnotify;

public class OddEvenMain {

    public static void main(String[] args) throws InterruptedException {

        OddEvenPrinterv3 printer= new OddEvenPrinterv3(20);

        Thread oddThread= new Thread(()->{
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"odd-Thread");


        Thread evenThread= new Thread(()->{
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"even-Thread");


        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();

        System.out.println("Done");
    }
}
