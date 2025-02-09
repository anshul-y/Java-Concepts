package com.java.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        //Deque<Integer> deque = new LinkedList<>(); // slower
        Deque<Integer> deque1 = new ArrayDeque<>(); //faster iteration, low memory, no null allowed, circular, head and tail
        deque1.addFirst(10); // head--
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);

        System.out.println(deque1);// 5, 10, 20, 25
        System.out.println("First Element: " + deque1.getFirst()); //5
        System.out.println("Last Element: " + deque1.getLast()); //25

        deque1.removeFirst(); // Removes 5
        deque1.pollLast(); // Removes 20

        for (int num : deque1) {
            System.out.println(num); // Current Deque: [10, 20]
        }
    }
}
