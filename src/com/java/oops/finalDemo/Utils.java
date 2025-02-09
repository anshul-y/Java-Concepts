package com.java.oops.finalDemo;

public class Utils {
    public static final int MAX_VALUE;

    static {
        MAX_VALUE = 110;    // if assigned the value to final while initializing, Cannot assign a new value to final variable
    }

    public static void printMaxValue() {
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }
}
