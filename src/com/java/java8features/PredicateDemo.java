package com.java.java8features;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    public static void main(String[] args) {
        /*Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        System.out.println(predicate.test(3));*/

        PredicateDemo predicateDemo = new PredicateDemo(); //traditional
        System.out.println(predicateDemo.test(4));

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
//        // lambda method
//        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        //Predicate -> boolean valued function i.e. return boolean.
        //used when need to check something, it holds a condition
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4)); //true

        Predicate<String> startWithA = x -> x.toLowerCase().startsWith("a");
        System.out.println(startWithA.test("Anshul"));  //true

        Predicate<String> endWithL = x -> x.toLowerCase().endsWith("l");
        System.out.println(endWithL.test("Anshul"));    //true

        Predicate<String> aAndL = startWithA.and(endWithL); //and() default method
        System.out.println(aAndL.test("Anshul"));   //true

        //BiPredicate
        BiPredicate<Integer, Integer> isEven1 = (x, y) -> (x+y)%2==0;
        System.out.println(isEven1.test(2,3));   //false

    }

    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}
