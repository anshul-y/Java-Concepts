package com.java.thread;

public class ImplementRunnable {
    public static void main(String[] args) {
        World1 world = new World1();
        Thread thread = new Thread(world);  //Thread object is created by passing an instance of World1.
        thread.start(); //start() is called on the Thread object to initiate the new thread.
        for (; ; ) {
            System.out.println("Hello");
        }
    }
}

class World1 implements Runnable {  // implements Runnable
    @Override
    public void run() { //overriding run() to define the code that constitutes the new thread
        for (; ; ) {
            System.out.println("World");
        }
    }
}
