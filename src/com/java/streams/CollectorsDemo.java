package com.java.streams;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors


        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);    //[Alice]

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);    //[1, 2, 3, 4, 5]

        // 3. Collecting to a Specific Collection
        nums.stream().collect(Collectors.toCollection(CopyOnWriteArrayList::new));

        // 4. Joining Strings
        // Concatenates stream elements into a single String
        String concatenatedNames = names.stream().collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);  //Alice, Bob, Charlie

        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, average, max)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(num -> num));
        System.out.println("Count: " + stats.getCount());   //Count: 5
        System.out.println("Sum: " + stats.getSum());   //Sum: 28
        System.out.println("Min: " + stats.getMin());   //Min: 2
        System.out.println("Max: " + stats.getMax());   //Max: 11
        System.out.println("Average: " + stats.getAverage());   //Average: 5.6

        // 6. Calculating Averages
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + average);  //Average: 5.6

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);  //Count: 5

        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        //grouping by length
        //classifier – a classifier function mapping input elements to keys
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));  //{4=[java], 5=[hello, world], 7=[streams], 10=[collecting]}

        //grouping by length and downstream/implementing the downstream reduction
        //classifier – a classifier function mapping input elements to keys
        //downstream - a Collector implementing the downstream reduction
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));    //{4=java, 5=hello, world, 7=streams, 10=collecting}
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));   //{4=1, 5=2, 7=1, 10=1}

        //classifier – a classifier function mapping input elements to keys
        //mapFactory – a function which, when called, produces a new empty Map of the desired type
        //downstream - a Collector implementing the downstream reduction
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);    //{4=1, 5=2, 7=1, 10=1}

        // 9. Partitioning Elements
        //  Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5))); //{false=[hello, world, java], true=[streams, collecting]}

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()))); //[HELLO, WORLD, JAVA, STREAMS, COLLECTING]

        // 11. toMap
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(fruit->fruit,String::length))); //{Apple=5, Cherry=6, Banana=6}
    }
}