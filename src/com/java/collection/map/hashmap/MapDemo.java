package com.java.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

//        // 1. iterate through a HashMap EntrySet using an iterator
//        Set<Entry<Integer, String>> entrySet = map.entrySet();
//        Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
//        while (entryIterator.hasNext()) {
//            Entry<Integer, String> entry = entryIterator.next();
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        // 2. iterate through a HashMap keys using an iterator
//        Set<Integer> keySet = map.keySet();
//        Iterator<Integer> keyIterator = keySet.iterator();
//        while (keyIterator.hasNext()) {
//            Integer key = keyIterator.next();
//            System.out.println(key + " : " + map.get(key));
//        }
//
//        // 3. iterate through a HashMap using a for-each loop
//        for (Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        // 4. iterate through a HashMap using lambda expression
//        map.forEach((key, value) -> System.out.println(key + " : " + value));
//
//        // 5. iterate through a HashMap values using stream api
//        map.entrySet().stream().forEach((entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()));
//
//        //iterate through a HashMap values using an iterator
//        Iterator<String> valueIterator = map.values().iterator();
//        while (valueIterator.hasNext()) {
//            String value = valueIterator.next();
//            System.out.println(value);
//        }

//        Map<Integer, String> evenMap = map.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0)
//                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
//
//        evenMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
