package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //feature introduced in Java 8
        //process collections of data in a functional and declarative manner
        //Simplify Data Processing
        //Embrace Functional Programming
        //Improve Readability and Maintainability
        //Enable Easy Parallelism

        //What is stream ?
        //a sequence of elements supporting functional and declarative programing

        //How to Use Streams ?
        //Source ,intermediate operations & terminal operation

        //traditional way
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //find number of even numbers
        int count = 0;
        for (int n : numbers){
            if(n%2==0){
                count++;
            }
        }
        System.out.println(count);  //2

        //using stream, numbers(source), filter(intermediate operations) and count(terminal operation)
        count = (int) numbers.stream().filter(x->x%2==0).count();
        System.out.println(count);  //2

        //Create stream

            //1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> collecStream = list.stream();

        //2. From Array
        String[] array = {"a","b","c"};
        Stream<String> arrStream = Arrays.stream(array);

        //3. Using Stream.of()
        Stream<String> streamOf = Stream.of("a", "b", "c");

        //4. Using Stream generator, infinite stream
        Stream<Integer> limitStream = Stream.generate(() -> 1).limit(10);

        //5. Using Stream iterator
        Stream<Integer> iteratorStream = Stream.iterate(1, x -> x + 1).limit(10);


    }
}
