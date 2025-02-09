package com.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.offer(2);

        System.out.println(queue.remove()); //if empty, throws exception
        System.out.println(queue.poll()); //if empty, return null

        System.out.println(queue.element()); //if empty, throws exception
        System.out.println(queue.peek()); //if empty, return null
    }
}
