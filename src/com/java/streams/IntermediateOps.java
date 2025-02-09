package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        //Intermediate Operations transform one stream into another stream
        //They are lazy, meaning they don't execute until a terminal operator is invoked.

        List<String> names = Arrays.asList("Shyam", "Anshul", "Ram", "Anshul");

        //filter()
        Stream<String> filteredStream = names.stream().filter(x -> x.toLowerCase().startsWith("a"));    //no filter at this point
        long count = names.stream().filter(x -> x.toLowerCase().startsWith("a")).count();
        System.out.println(count);  //2

        //map()
        Stream<String> lowercaseNames = names.stream().map(x -> x.toLowerCase());
        List<String> lowercaseNamesList = names.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowercaseNamesList); //[shyam, anshul, ram, anshul]

        //sorted()
        Stream<String> sortedStream = names.stream().sorted();
        Stream<String> sortedBySize = names.stream().sorted((str1, str2) -> str1.length() - str2.length());
        List<String> collect = sortedBySize.collect(Collectors.toList());
        System.out.println(collect);    //[Ram, Shyam, Anshul, Anshul]

        //distinct()
        System.out.println(names.stream().filter(x -> x.toLowerCase().startsWith("a")).count());    //2
        System.out.println(names.stream().filter(x -> x.toLowerCase().startsWith("a")).distinct().count()); //1

        //limit()
        Stream.iterate(1, x -> x + 1);   //infinite stream
        Stream<Integer> limitStream = Stream.iterate(1, x -> x + 1).limit(10);//1,2,3,4,5,6,7,8,9,10
        System.out.println(limitStream.collect(Collectors.toList()));   //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //skip()
        Stream<Integer> skipStream = Stream.iterate(1, x -> x + 1).limit(10).skip(5);
        System.out.println(skipStream.collect(Collectors.toList()));    //6, 7, 8, 9, 10
        Stream<Integer> skipStream1 = Stream.iterate(1, x -> x + 1).skip(5).limit(10);
        System.out.println(skipStream1.collect(Collectors.toList()));   //6, 7, 8, 9, 10, 11, 12, 13, 14, 15

        //peek()
        // Performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).limit(10).skip(5).peek(System.out::println).count();

        //flatmap()
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));  //kiwi
        System.out.println(listOfLists.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));   //[APPLE, BANANA, ORANGE, KIWI, PEAR, GRAPE]

    }
}
