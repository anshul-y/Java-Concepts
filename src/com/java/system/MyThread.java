package com.java.system;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is Running...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread n = new MyThread("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();
    }
}


//Thread is Running...
//Thread is Running...
//Low Priority Thread - Priority: 1 - count: 1
//Thread is Running...
//Medium Priority Thread - Priority: 5 - count: 1
//High Priority Thread - Priority: 10 - count: 1
//High Priority Thread - Priority: 10 - count: 1
//Medium Priority Thread - Priority: 5 - count: 1
//Low Priority Thread - Priority: 1 - count: 1
//High Priority Thread - Priority: 10 - count: 1
//Low Priority Thread - Priority: 1 - count: 1
//Medium Priority Thread - Priority: 5 - count: 1
//High Priority Thread - Priority: 10 - count: 1
//Medium Priority Thread - Priority: 5 - count: 1
//Low Priority Thread - Priority: 1 - count: 1
//High Priority Thread - Priority: 10 - count: 1
//Medium Priority Thread - Priority: 5 - count: 1