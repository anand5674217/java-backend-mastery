package com.anand.concurrency.waitnotify.print1ToNusingMthreads;

public class Resource {

   public static int noOfThreads=4;
    public static int max=16;

    public Resource(int noOfThreads, int max){
        this.noOfThreads=noOfThreads;
        this.max=max;

    }

    public static void main(String[] args) {

        Thread[] threadArray= new Thread[noOfThreads];

        for(int i=0;i<noOfThreads;i++){
            threadArray[i] = new Thread("Thread_00"+i);
            threadArray[i].start();
        }
        int count=1;
        while(count<max){

            int curr=count%noOfThreads;

            System.out.println(count+" is printed by "+ threadArray[curr].getName());
            count++;
        }


    }


}
