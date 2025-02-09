package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        /*for (int i = 1; i <= 10; i++) {
            long result = factorial(i);
            System.out.println(result);
        }*/


        /*Thread[] threads = new Thread[10];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
                threads[i-1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
            threads[i-1].start();
        }
        for (int i = 1; i < 10; i++) {
            try {
                threads[i-1].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }*/

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            Future<?> future = executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();
        try {
            //executor.awaitTermination(1, TimeUnit.SECONDS);
            while(!executor.awaitTermination(100, TimeUnit.MICROSECONDS)){
                //System.out.println("waiting...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total time " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long result = 1;
        for (int i = n; i > 0; i--) {
            result*=i;
        }
        return result;
    }
}
