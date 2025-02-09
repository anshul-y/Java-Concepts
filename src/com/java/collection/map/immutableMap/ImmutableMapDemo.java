package com.java.collection.map.immutableMap;

import java.util.*;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Orange", 3);
        map.put("Banana", 2);
        Map<String, Object> immutableMap = Collections.unmodifiableMap(map);
//        immutableMap.put("Cherry",5); //throws error
        map.put("Apple", 1);
        map.put("Mango", 4);
        System.out.println(immutableMap);
    }
}
