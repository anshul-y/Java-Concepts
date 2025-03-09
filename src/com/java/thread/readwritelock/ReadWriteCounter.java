package com.java.thread.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i + " read: " + counter.getCount());
            }
        };

        Runnable writeTask = () -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " " + i + " incremented");
            }
        };

        Thread writerThread1 = new Thread(writeTask, "1 writer");
//        Thread writerThread2 = new Thread(writeTask, "2 writer");
        Thread readerThread1 = new Thread(readTask, "1 reader");
        Thread readerThread2 = new Thread(readTask, "2 reader");

        writerThread1.start();
//        writerThread2.start();
        readerThread1.start();
        readerThread2.start();

        writerThread1.join();
        readerThread1.join();
//        writerThread2.join();
        readerThread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}