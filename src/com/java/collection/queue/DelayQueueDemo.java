package com.java.collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<DelayTask> queue = new DelayQueue<DelayTask>();
    }
}

class DelayTask implements Delayed {

    long startTime ;

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    public long getDetay(TimeUnit unit) {
        long remaining = this.startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayTask) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayTask) o).startTime) {
            return 1;
        }
        return 0;
    }
}
