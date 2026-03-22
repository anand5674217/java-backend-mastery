package com.anand.concurrency.waitnotify;

public class ProducerConsumerDemo {

    public static void main(String[] args) throws InterruptedException{

        Buffer buffer= new Buffer(3);

        Thread producer= new Thread(()-> {

            for (int i = 0; i < 5; i++) {
                try {
                    buffer.produce(new Message("Anand "+i));
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            },"producer-thread"
        );

        Thread consumer= new Thread(()->{

            for(int i=0;i<3;i++){
                try {
                    Message msg=buffer.consume();
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"consumer-thread");


        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Producer consumer demo finished");
    }
}
