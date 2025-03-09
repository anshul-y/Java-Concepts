package com.java.thread.implementthread;

public class ExtendThread {
    public static void main(String[] args) {
        World world = new World();
        world.start();  //start() is called to initiate the new thread.
        for (; ; ) {
            System.out.println("Hello");
        }
    }
}
class World extends Thread {    //class extends Thread
    @Override
    public void run() { //overriding run() to define the code that constitutes the new thread
        for (; ; ) {
            System.out.println("World");
        }
    }
}

