package com.java.thread.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = () -> example.accessResource();

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//Thread 1 acquired.
//Thread 1 released.
//Thread 2 acquired.
//Thread 2 released.
//Thread 3 acquired.
//Thread 3 released.
