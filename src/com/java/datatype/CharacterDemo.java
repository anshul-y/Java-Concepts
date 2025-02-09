package com.java.datatype;

public class CharacterDemo {
    public static void main(String[] args) {
        //to store single character or symbols
        //char value is stored in memory as numeric value corresponding to character

        System.out.println((int) Character.MIN_VALUE);  //0
        System.out.println((int) Character.MAX_VALUE);  //65535

        char initial = 'A'; //single character enclosed by single quotes
        System.out.println(initial);    //A

        char a = 65;    //can store the numeric value of character
        System.out.println(a);  //A

        char b = '\u0041';  //unique code representation
        System.out.println(b);  //A
    }
}