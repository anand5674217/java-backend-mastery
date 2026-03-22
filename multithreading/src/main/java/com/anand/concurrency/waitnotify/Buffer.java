package com.anand.concurrency.waitnotify;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    private final Queue<Message> queue= new LinkedList<>();
    private final int max;

    public Buffer(int max){
        this.max=max;
    }

    public synchronized void produce(Message message) throws InterruptedException{

        while(queue.size()==max){
            System.out.println("Buffer is full, producer waiting");
            wait();
        }

        queue.add(message);
        System.out.println("Produced "+ message+ " by "+ Thread.currentThread().getName());
        notifyAll();

    }

    public synchronized Message consume() throws InterruptedException{

        while(queue.isEmpty()){
            wait();
        }

        Message msg=queue.remove();
        System.out.println("Consumed "+ msg+ " by "+ Thread.currentThread().getName());
        notifyAll();
        return msg;
    }





}
