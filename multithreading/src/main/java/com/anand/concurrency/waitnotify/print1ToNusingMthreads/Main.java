package com.anand.concurrency.waitnotify.print1ToNusingMthreads;

public class Main {

    public static void main(String[] args) {

        SharedClass sharedClass= new SharedClass(10);
        int m=3;
        for (int i = 0; i < m; i++) {
            Thread thread= new Thread(new NumberPrinter(sharedClass,i,m),"Thread - "+i);
            thread.start();
        }
    }
}
