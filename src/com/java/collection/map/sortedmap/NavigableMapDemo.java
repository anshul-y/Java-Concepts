package com.java.collection.map.sortedmap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
NavigableMap<Double, String> map = new TreeMap<>();
map.put(4.2, "Four");
map.put(1.5, "One");
map.put(2.6, "Two");
map.put(3.0, "Three");
System.out.println(map); //{1.5=One, 2.6=Two, 3.0=Three, 4.2=Four}
System.out.println(map.floorKey(2.0)); //1.5
System.out.println(map.ceilingKey(2.0)); //2.6
System.out.println(map.descendingMap()); //{4.2=Four, 3.0=Three, 2.6=Two, 1.5=One}
System.out.println(map.lowerEntry(2.0)); //1.5=One
System.out.println(map.higherEntry(2.0)); //2.6=Two
    }
}
