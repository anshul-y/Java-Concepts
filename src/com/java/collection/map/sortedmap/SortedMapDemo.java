package com.java.collection.map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
//        SortedMap<String, Integer> sortedMap = new TreeMap<>((a, b) -> b.compareTo(a)); //descending order
        sortedMap.put("Orange", 3);
        sortedMap.put("Banana", 2);
        sortedMap.put("Apple", 1);
        sortedMap.put("Mango", 4);
        System.out.println(sortedMap); //{Apple=1, Banana=2, Mango=4, Orange=3}
        System.out.println(sortedMap.firstKey()); //Apple
        System.out.println(sortedMap.lastKey()); //Orange
        System.out.println(sortedMap.headMap("Banana")); //{Apple=1}
        System.out.println(sortedMap.tailMap("Banana")); //{Banana=2, Mango=4, Orange=3}
        System.out.println(sortedMap.subMap("Apple", "Orange")); //{Apple=1, Banana=2, Mango=4}
    }
}
