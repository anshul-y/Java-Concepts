package com.java.collection.map.hashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
String key1 = new String("key");
String key2 = new String("key");
// Map<String, Integer> map = new HashMap<>(); //hashcode(based on the string pass to the String constructor) and equals
Map<String, Integer> map = new IdentityHashMap<>(); //IdentityHashcode(based on the object memory address) and ==
map.put(key1, 1);
map.put(key2, 2);
System.out.println(System.identityHashCode(key1)); //204349222
System.out.println(System.identityHashCode(key2)); //231685785
System.out.println(key1.hashCode()); //106079
System.out.println(key2.hashCode()); //106079
System.out.println(key1.equals(key2));
System.out.println(map);
    }
}
