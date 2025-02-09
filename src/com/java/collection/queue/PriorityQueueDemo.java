package com.java.collection.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b) -> a.compareTo(b)); //custom ordering
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();   //natural ordering
        priorityQueue.add(15);
        priorityQueue.add(30);
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(5);

        System.out.println(priorityQueue); // not stored in sorted manner

        while (!priorityQueue.isEmpty()) {
            System.out.println("Head: " + priorityQueue.poll()); // remove in order
        }
    }
}
