package com.java.oops.accessmodifiers.test;

import com.java.oops.accessmodifiers.school.School;

public class Test {
    public static void main(String[] args) {
        School.getInstance();   //create a new instance
        School.getInstance();   //get the created instance
        School.getInstance();   //get the created instance
    }
}
