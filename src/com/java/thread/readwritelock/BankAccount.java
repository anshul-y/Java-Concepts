package com.java.thread.readwritelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();
    Logger logger = Logger.getLogger(BankAccount.class.getName());

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000); // Simulate time taken to process the withdrawal
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        Runnable task = () -> sbi.withdraw(50);
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}

//Thread 1 attempting to withdraw 50
//Thread 2 attempting to withdraw 50
//Thread 1 proceeding with withdrawal
//Thread 2 could not acquire the lock, will try later
//Thread 1 completed withdrawal. Remaining balance: 50
