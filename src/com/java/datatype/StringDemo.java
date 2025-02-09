package com.java.datatype;

public class StringDemo {
    public static void main(String[] args) {

        // creating a reference variable to string object
        // assign the memory in heap
        String str2 = new String("hello world");

        //assigning literal
        //heap memory -> string pool
        String str1 = "hello world";

        //Ram is stored in string pool and will be using that only in a,b,c,d
        //x,c,d will point to the memory allocation of "Ram" stored in string pool
        //a,b will point to the memory allocation of "Ram" stored in heap memory
        String x = "Ram";   //stored in string pool
        String a = new String("Ram");   //stored in heap memory
        String b = new String("Ram");   //stored in heap memory
        System.out.println(a==b);   //false
        String c = "Ram";   //stored in string pool
        String d = "Ram";   //stored in string pool
        System.out.println(c==d);   //true, pointing to the same address in string pool
        System.out.println(a==c);   //false, a is in Heap memory and c is in String pool


        String str = "hello world";
        System.out.println(str.length());
        System.out.println(str.charAt(0)); //range (0 - length-1)
        System.out.println(a.equals(c));    //checks char

        int asciiA = 'A';   //65
        int asciia = 'a';   //97
        System.out.println(asciiA);
        System.out.println(asciia);
        System.out.println((char) 99);  //c
        System.out.println("anshul".compareTo("anshul"));   //-32, first diff in ascii value of chars
        System.out.println("Anshul".compareTo("AnShul"));   //32
        System.out.println(String.valueOf(999));
        System.out.println(String.format("Hello %s","Anshul"));

    }
}
