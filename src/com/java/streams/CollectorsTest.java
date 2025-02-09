package com.java.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        // Example 1: Collecting Names by Length
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length))); //{3=[Bob], 4=[Anna], 5=[Brian, Alice], 9=[Alexander]}

        // Example 2: Counting Word Occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(word->word,Collectors.counting())));    //{java=1, world=2, hello=2}

        // Example 3: Partitioning Even and Odd Numbers
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(num->num%2==0)));  //{false=[1, 3, 5], true=[2, 4, 6]}

        // Example 4: Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));    //45

        // Example 5: Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(fruit->fruit,String::length))); //{Apple=5, Cherry=6, Banana=6}

        // Example 6: Count words and store in map
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(key->key,valueOfKey->1,(oldKey,newKey)->oldKey+newKey)));   //{orange=1, banana=2, apple=3}

    }
}
