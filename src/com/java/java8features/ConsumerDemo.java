package com.java.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        Consumer<Integer> consumer = (s) -> System.out.println("Number: "+s);
        consumer.accept(100);

        numbers.stream().forEach((s) -> System.out.println("Number: "+s));

        numbers.forEach((s) -> System.out.println("Number: "+s));

        //Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(23);
        List<Integer> list = Arrays.asList(1,2,3,4);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        //BiConsumer
        BiConsumer<String, Integer> isLengthEqual = (x, y) -> {
            System.out.println(x.length()==y);
        };
        isLengthEqual.accept("Anshul", 6);  //true

    }
}
