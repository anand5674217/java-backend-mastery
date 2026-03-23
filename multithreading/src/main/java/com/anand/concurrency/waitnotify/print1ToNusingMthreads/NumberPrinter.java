package com.anand.concurrency.waitnotify.print1ToNusingMthreads;

public class NumberPrinter implements  Runnable{

    private SharedClass sharedClass;
    private int threadId;
    private int m;//totalNoOfThreds

    public NumberPrinter(SharedClass sharedClass, int threadId, int m) {
        this.sharedClass = sharedClass;
        this.threadId = threadId;
        this.m = m;
    }

    @Override
    public void run() {

        while(true){
            synchronized (sharedClass){

                while(((sharedClass.getCounter()-1)%m!=threadId) && (sharedClass.getCounter() <= sharedClass.getMax())){
                    try {
                        sharedClass.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(sharedClass.getCounter()> sharedClass.getMax()){
                    sharedClass.notifyAll();
                    break;
                }

                sharedClass.print();
                sharedClass.notifyAll();

            }
        }

    }
}
