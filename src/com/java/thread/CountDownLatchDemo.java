package com.java.thread;

import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        for (int i = 0; i < numberOfServices; i++) {
            new Thread(new DependentService(latch)).start();
        }
        latch.await();
        System.out.println("Main");
    }
}

class DependentService implements Runnable {
    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); //taking more time than expected
            System.out.println(Thread.currentThread().getName() + " service started.");
        } catch(Exception e){}
        finally {
            latch.countDown();
        }
    }
}
//Thread-0 service started.
//Thread-2 service started.
//Thread-1 service started.
//Main

