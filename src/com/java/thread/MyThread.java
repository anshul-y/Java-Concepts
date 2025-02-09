package com.java.thread;

class Counter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}


public class MyThread extends Thread{

    private Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(counter.getCounter());
    }
}
