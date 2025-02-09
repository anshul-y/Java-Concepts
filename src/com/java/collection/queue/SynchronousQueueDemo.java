package com.java.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting...");
                queue.put("Hello, Consumer");
                System.out.println("Producer has transferred the message");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting...");
                String message = queue.take();
                System.out.println("Consumer has received the message: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        });
        producer.start();
        consumer.start();
    }
}
