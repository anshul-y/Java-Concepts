package com.java.datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WholeNumbers {
    public static void main(String[] args) {
        byte age = 127;
        short age1 = 32767;
        int age2 = 2147483647;
        //long age3 = 2147483648; //Integer number too large, will treat as integer without l
        long age3 = 2147483648l; //add l in the end to treat as long

        System.out.println(age3);

        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); //127

        System.out.println(Short.MIN_VALUE);    //-32768
        System.out.println(Short.MAX_VALUE);    //32767

        System.out.println(Integer.MIN_VALUE);  //-2147483648
        System.out.println(Integer.MAX_VALUE);  //2147483647

        System.out.println(Long.MIN_VALUE); //-9223372036854775808
        System.out.println(Long.MAX_VALUE); //9223372036854775807
    }
}
