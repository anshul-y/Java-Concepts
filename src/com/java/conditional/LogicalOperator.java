package com.java.conditional;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a > 0 && b > 0); // true
        System.out.println(a < 0 && b > 0); // false
        System.out.println(a > 0 || b > 0); // true
        System.out.println(a < 0 || b < 0); // true
        System.out.println(!(a > 0 && b > 0)); // false
        System.out.println(!(a < 0 && b > 0)); // true
        System.out.println(!(a > 0 || b < 0)); // false
    }
}
