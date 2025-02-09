//first commented line
package com.java.oops;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(factorial(5));   //120
    }

    //recursive
    private static int factorial(int n) {
        if(n==1){
            return 1;  // Base case: factorial of 1 is 1. 0! = 1.
        }
        return n * factorial(n-1);
    }

    //not recursive
//    private static int factorial(int n) {
//        int res = 1;
//        for (int i = 1; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }
}
