package com.anand.concurrency.basics;

public class Counter {

    int count=0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
