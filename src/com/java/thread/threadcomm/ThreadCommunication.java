package com.java.thread.threadcomm;

class SharedResource {
    private int data;           // Shared data between producer and consumer.
    private boolean hasData = false; // Flag to check if data is available.

    /**
     * Produces data and notifies the consumer.
     * If data already exists, the producer thread waits until consumption occurs.
     */
    public synchronized void produce(int value) {
        while (hasData) { // If data is already available, wait for consumption.
            try {
                wait(); // Release lock and wait until the consumer consumes the data.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value; // Set new data.
        hasData = true; // Mark data as available.
        System.out.println("Produced: " + value);
        notify(); // Notify the waiting consumer thread (trying/waiting to acquire lock), that data is available.
    }

    /**
     * Consumes data and notifies the producer.
     * If no data is available, the consumer thread waits until production occurs.
     */
    public synchronized int consume() {
        while (!hasData) { // If no data is available, wait for production.
            try {
                wait(); // Release lock and wait until the producer generates new data.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false; // Mark data as consumed.
        System.out.println("Consumed: " + data);
        notify(); // Notify the waiting producer thread that the buffer is empty.
        return data;
    }
}

class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource), "Producer");
        Thread consumerThread = new Thread(new Consumer(resource), "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}

//Produced: 0
//Consumed: 0
//Produced: 1
//Consumed: 1
//...
//...
//Produced: 8
//Consumed: 8
//Produced: 9
//Consumed: 9