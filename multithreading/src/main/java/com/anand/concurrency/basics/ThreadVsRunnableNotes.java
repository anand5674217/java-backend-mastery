package com.anand.concurrency.basics;

public class ThreadVsRunnableNotes {


    public static void main(String[] args) {
        System.out.println("Thread vs Runnable");
        System.out.println("--------------------");
        System.out.println("1. Thread = actual thread object");
        System.out.println("2. Runnable = task that thread will execute");
        System.out.println("3. Prefer Runnable in Real projects");
        System.out.println("4. One task can be given to multiple threads.");
        System.out.println("5. Extending Thread is less flexible because Java allows single inheritance");
    }
}
