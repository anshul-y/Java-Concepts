package com.java.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        //computer store data in binary format
        // 00000000 00000000 00000000 00000000
        System.out.println(Integer.toBinaryString(5));

        // if you want play with binary numbers, bitwise operator is used
        //faster than arithmetic
        //operands(on which operation is performed): byte,short,int,long
        //decimal numbers are parsed into parts i.e. not supported

        int res;
        int a = 5;  //101
        int b = 6;  //110
        System.out.println("a: "+Integer.toBinaryString(a));
        System.out.println("b: "+Integer.toBinaryString(b));

        //and operator (&)
        res = a & b;
        System.out.println("a & b = " + (a & b) +"("+Integer.toBinaryString(res)+")"); // 4

        //or operator (|)
        res = a | b;
        System.out.println("a | b = " + (a | b) +"("+Integer.toBinaryString(res)+")"); // 7

        //xor operator (^) if bytes are different then 1
        res = a ^ b;
        System.out.println("a ^ b = " + (a ^ b) +"("+Integer.toBinaryString(res)+")"); // 3

        //not operator (~)
        res = ~a;
        System.out.println("~a = " + ~a +"("+Integer.toBinaryString(res)+")"); // -6

        //left shift operator (<<)
        res =  a<<1;
        System.out.println("a << 1 = " + (a << 1) +"("+Integer.toBinaryString(res)+")"); // 10

        //right shift operator (>>) if number is negative fill with 1, else 0
        res = a>>1;
        System.out.println("a >> 1 = " + (a >> 2) +"("+Integer.toBinaryString(res)+")"); // 2

        //unsigned right shift operator (>>>), it fills the left side with 0
        res = a>>>1;
        System.out.println("a >>> 1 = " + (a>>>2) +"("+Integer.toBinaryString(res)+")");

    }
}
