package com.java.collection.map.concurrentmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
//        SortedMap<String, Object> hashMap = new TreeMap<>(); //{Apple=1, Orange=3}
        ConcurrentSkipListMap<String, Object> hashMap = new ConcurrentSkipListMap<>();

        Thread thread1 = new Thread(() -> {
            hashMap.put("Orange", 3);
            hashMap.put("Apple", 1);
        });
        Thread thread2 = new Thread(() -> {
            hashMap.put("Banana", 2);
            hashMap.put("Mango", 4);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(hashMap); //{Apple=1, Banana=2, Mango=4, Orange=3}
    }
}
