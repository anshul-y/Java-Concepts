package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob","Alice","Charlie","Anshul");
        Stream<String> stringStream = names.stream().filter(name -> {
            System.out.println("Checking: " + name);
            return name.length() > 3;
        });
        System.out.println("Before Terminal Operation");
        List<String> filteredName = stringStream.collect(Collectors.toList());
        System.out.println("After Terminal Operation");
        System.out.println(filteredName);
    }
}

//Before Terminal Operation
//Checking: Bob
//Checking: Alice
//Checking: Charlie
//Checking: Anshul
//After Terminal Operation
//[Alice, Charlie, Anshul]
