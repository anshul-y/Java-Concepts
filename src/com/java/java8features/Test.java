package com.java.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        // combined example
        Supplier<Integer> supplier = () -> 100;
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);

        if (predicate.test(supplier.get())) {     //get the data from supplier, and check condition using predicate
            consumer.accept(function.apply(supplier.get()));    //get the data from supplier, apply function on data and consumer accept the data from function to print
        }

    }
}
