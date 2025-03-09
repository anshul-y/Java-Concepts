package com.java.thread.executorservice;

import java.util.concurrent.*;

public class ExecutorFramework {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        //will execute in sequential manner
        /*for (int i = 1; i <= 10; i++) {
            long result = factorial(i);
            System.out.println(result);
        }*/

        //main thread will not wait for factorial to calculate and print time first
        /*for (int i = 1; i < 10; i++) {
            int finalI = i; //effectively final temp variable
            Thread thread = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
            thread.start();
        }*/

        /*Thread[] threads = new Thread[10];
        for (int i = 1; i < 10; i++) {
            int finalI = i; // Effectively final variable for lambda expression
            threads[i - 1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
            threads[i - 1].start();
        }

        // Wait for all threads to complete execution using join()
        for (int i = 1; i < 10; i++) {
            try {
                threads[i - 1].join();  // Main thread waits for the current thread to finish
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }*/

        //using Executor Interface
       /* Executor executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.execute(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }*/

        //using ExecutorService Interface without Future
        /*ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();
        try {
            //executor.awaitTermination(1, TimeUnit.SECONDS);
            while(!executor.awaitTermination(100, TimeUnit.MICROSECONDS)){
                System.out.println("waiting...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        //using ExecutorService Interface with Future
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            Future<Long> future = executor.submit(() -> factorial(finalI));
            long result = future.get(); //wait for thread to complete
            if(future.isDone()) {
                System.out.println(result);
            }
        }
        executor.shutdown();

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
            result *= i;
        }
        return result;
    }
}