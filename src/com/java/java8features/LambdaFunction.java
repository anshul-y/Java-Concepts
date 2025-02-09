package com.java.java8features;

import java.util.function.Consumer;

public class LambdaFunction {

    public static void main(String[] args) {
//        Runnable, Comparable, Comparator, Consumer, Predicate, Supplier
        Consumer<Integer> consumer = (input) -> System.out.println("Number: "+input);
        consumer.accept(10);
    }
}
