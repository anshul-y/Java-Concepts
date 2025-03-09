package com.java.thread;

class SharedObj {
    private volatile boolean flag = false;  //made flag volatile to read the value from main memory not from thread cached memory

    public void setFlagTrue() {
        System.out.println("Writer thread made the flag true !");
        flag = true;
    }

    public void printIfFlagTrue() {
        while (!flag) {
            // do nothing
        }
        System.out.println("Flag is true !");
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}
//Writer thread made the flag true !
//Flag is true !