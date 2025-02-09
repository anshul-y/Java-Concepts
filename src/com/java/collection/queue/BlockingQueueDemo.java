package com.java.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BlockingQueueDemo {
    public static void main(String[] args) {
        // Create a bounded blocking queue with capacity 5
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }

    static class Producer implements Runnable {
        BlockingQueue<Integer> queue;
        private int value = 0;

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Produced: " + value);
                    queue.put(value++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupted();
                    System.out.println("Producer Interrupted");
                }
            }
        }
    }

    static class Consumer implements Runnable {
        BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Integer value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupted();
                    System.out.println("Consumer Interrupted");
                }
            }
        }
    }

}
