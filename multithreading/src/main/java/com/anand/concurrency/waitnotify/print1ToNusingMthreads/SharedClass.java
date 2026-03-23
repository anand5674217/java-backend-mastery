package com.anand.concurrency.waitnotify.print1ToNusingMthreads;

public class SharedClass {

    int max;
    int counter=1;

    public SharedClass(int m){
        this.max=m;
    }

    public void print(){
        System.out.println(counter+ " is printer by thread "+ Thread.currentThread().getName());
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
