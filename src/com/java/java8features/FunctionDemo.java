package com.java.java8features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function -> work for you
        //apply(), abstract method
        //andThen(), default method
        //compose(), default method
        //identity(), static method

        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> tripleIt = x -> x*3;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));  //20*2 then 40*3
        System.out.println(doubleIt.compose(tripleIt).apply(20));  //20*3 then 60*2, reverse of andThen()
        System.out.println(doubleIt.apply(20));    //200

        Function<Integer, Integer> identity = Function.identity();  //static method
        Integer res = identity.apply(5);    //return the same value
        System.out.println(res);    //5

        //BiFunction
        BiFunction<String, String, Integer> stringLength = (x, y) -> (x+y).length();
        System.out.println(stringLength.apply("Anshul", "Yadav"));  //11

        //UnaryOperator -> Function if input and return data type is same
        UnaryOperator<Integer> unaryOperator = (x) -> x*2;
        System.out.println(unaryOperator.apply(2)); //4

        //BinaryOperator -> BiFunction if input and return data type is same
        BinaryOperator<Integer> binaryOperator = (x, y) -> x*y;
        System.out.println(binaryOperator.apply(2,3));  //6
    }
}
