package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Bob","Shyam","Anshul");

        //name length greater than 3
        List<String> collect = names.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.println(collect);    //[Shyam, Anshul]

        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        //find sqrt and sort
        List<Integer> sortedSqrt = nums.stream().map(x->x*x).sorted().collect(Collectors.toList());
        System.out.println(sortedSqrt); //[1, 4, 16, 25, 49]

        //sum values
        Integer sum = nums.stream().reduce(Integer::sum).get();
        System.out.println(sum);    //19

        //counting occurrence of char
        String str = "Hello World";
        long count = str.chars().filter(x -> x == 'l').count(); //chars() convert string char into corresponding int value
        System.out.println(count);  //3

        //cumulative sum, parallelStream cannot be used as it is used for stateless operations
        AtomicInteger total = new AtomicInteger(0);
        List<Integer> cumulativeSumList = nums.stream().map(x -> total.addAndGet(x)).collect(Collectors.toList());
        System.out.println(cumulativeSumList);  //[1, 3, 6, 10, 15]
        List<Integer> cumulativeParallelSumList = nums.parallelStream().map(x -> total.addAndGet(x)).collect(Collectors.toList());
        System.out.println(cumulativeParallelSumList);  //[30, 29, 18, 27, 23]

        //convert element of list as a single list in uppercase
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(words);//[HELLO, WORLD, JAVA, STREAMS, ARE, POWERFUL, FLATMAP, IS, USEFUL]

    }
}
