package com.java.conditional;

public class RelationalOperator {
    public static void main(String[] args) {
        //Relational Operators compare two values and return a boolean
        int a = 10, b = 20;

        // Equality operator
        System.out.println(a == b); // false

        // Inequality operator
        System.out.println(a!= b); // true

        // Greater than operator
        System.out.println(a > b); // false

        // Less than operator
        System.out.println(a < b); // true

        // Greater than or equal to operator
        System.out.println(a >= b); // false

        // Less than or equal to operator
        System.out.println(a <= b); // true

        // Conditional operator
        int result = (a > b) ? a : b;
        System.out.println("The larger number is: " + result);
    }
}
