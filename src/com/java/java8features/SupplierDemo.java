package com.java.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier-> does not take anything for input but return something
        Supplier<String> giveHelloWorld = () -> "Hello World!";
        System.out.println(giveHelloWorld.get());   //Hello World!

        Supplier<Integer> supplier = () -> -1;
        List<Integer> numbers = Arrays.asList(3,2,3);
        List<Integer> numbers1 = Arrays.asList();
        System.out.println(numbers.stream().findAny().orElseGet(supplier));
        System.out.println(numbers1.stream().findAny().orElseGet(() -> -1));


    }
}
