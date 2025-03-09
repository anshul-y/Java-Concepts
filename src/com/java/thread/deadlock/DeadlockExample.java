package com.java.thread.deadlock;

class Pen {
    public synchronized void writeOnPaper(Paper paper) {    //acquire the Pen lock
        System.out.println(Thread.currentThread().getName() + " is using " + this.getClass().getSimpleName() + " and trying to use " + paper.getClass().getSimpleName());
        paper.finishWriting();  // Tries to acquire lock on the Paper object (but cannot because Thread-2 has it).
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using " + this.getClass().getSimpleName());
    }
}

class Paper {
    public synchronized void writeWithPen(Pen pen) {    //acquire the Paper lock
        System.out.println(Thread.currentThread().getName() + " is using " + this.getClass().getSimpleName() + " and trying to use " + pen.getClass().getSimpleName());
        pen.finishWriting();    //Tries to acquire lock on the Pen object (but cannot because Thread-1 has it).
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using " + this.getClass().getSimpleName());
    }
}

class Task1 implements Runnable {
    private final Pen pen;
    private final Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeOnPaper(paper); //Thread-1 holds the Pen lock and waits for the Paper lock.
    }
}

class Task2 implements Runnable {
    private final Pen pen;
    private final Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen) {    // Acquire Pen lock to maintain the order same as Thread-1 across all threads.
            paper.writeWithPen(pen); // Thread-2 holds the Paper lock and waits for the Pen lock.
        }
    }

}

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}

//Thread-1 is using Pen and trying to use Paper
//Thread-2 is using Paper and trying to use Pen

//Thread-1 is using Pen and trying to use Paper
//Thread-1 finished using Paper
//Thread-2 is using Paper and trying to use Pen
//Thread-2 finished using Pen
