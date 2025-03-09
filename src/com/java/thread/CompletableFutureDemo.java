package com.java.thread;

import java.util.concurrent.*;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = Executors.newFixedThreadPool(3);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("worker start");
                Thread.sleep(5000);
                System.out.println("worker end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "ok";
        }, executor).thenApply((res) -> res+res).exceptionally(s->"Error Occurred");

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("worker start");
                Thread.sleep(5000);
                System.out.println("worker end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "ok";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(completableFuture, completableFuture2); //return type of future is void to check if process is completed

        String s = completableFuture.getNow("Not Completed yet"); //Returns the result value if completed, else returns the given valueIfAbsent.
        System.out.println(s);
        String s1 = completableFuture.get(); //Waits if necessary for this future to complete, and then returns its result.
        completableFuture2.join();
        System.out.println(s1);

        System.out.println("main");
    }
}
//Not Completed yet
//worker start
//worker end
//okok
//main