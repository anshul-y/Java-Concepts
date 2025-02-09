package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        //to get the result from stream
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //collect()
        List<Integer> collect = list.stream().skip(2).collect(Collectors.toList());
        System.out.println(collect);    //[3, 4, 5]

        //count()
        long count = list.stream().count();
        System.out.println(count);  //5

        //forEach()
        list.stream().forEach(System.out::println);

        //reduce() -> combines elements to produce single result
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> reduceSum = list.stream().reduce(Integer::sum);   //using method reference
        System.out.println(reduceSum.get());   //15

        //Short Circuit operations(as soon as find element they break the circuit) -> anyMatch(), noneMatch(), allMatch(), findFirst(), findAny()
        System.out.println(list.stream().anyMatch(x -> x % 2 == 0));   //true
        System.out.println(list.stream().allMatch(x -> x > 0));   //true
        System.out.println(list.stream().noneMatch(x->x<0));  //true
        System.out.println(list.stream().findFirst().get());    //1
        System.out.println(list.stream().findAny().get());  //

        //toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();

        //min / max
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o2 - o1).get());    //2
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()).get());  //2

        //forEachOrdered()
        System.out.println("Parallel Stream using forEach:");
        Stream.iterate(1,x->x+1).limit(10).parallel().forEach(System.out::print);   //7 6 1 2 5 4 9 8 10 3
        System.out.println("Parallel Stream using forEachOrdered:");
        Stream.iterate(1,x->x+1).limit(10).parallel().forEachOrdered(System.out::print); //1 2 3 4 5 6 7 8 9 10
        System.out.println("Sequential Stream:");
        Stream.iterate(1,x->x+1).limit(10).sequential().forEach(System.out::print);//1 2 3 4 5 6 7 8 9 10

    }
}
