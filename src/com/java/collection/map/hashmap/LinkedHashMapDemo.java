package com.java.collection.map.hashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(11, 0.8f, true);
        linkedHashMap.put("Orange", 1);
        linkedHashMap.put("Apple", 2);
        linkedHashMap.put("Banana", 3);
        linkedHashMap.put("Mango", 4);
        linkedHashMap.get("Orange");

        linkedHashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+"="+entry.getValue()));
    }
}
