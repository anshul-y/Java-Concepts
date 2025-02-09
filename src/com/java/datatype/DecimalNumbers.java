package com.java.datatype;

public class DecimalNumbers {
    public static void main(String[] args) {
        float a = 1000.123456789123456f;    //7 digit precision(00012345)
        double b = 1000.123456789123456;    //15 digit precision(0001234567891235)

        System.out.println(a);  //1000.1235
        System.out.println(b);  //1000.1234567891235

        float c = 105555555555655555555.234234f;
        double d = 105555555555655555555.234234;

        System.out.println(c);  //1.0555555E20
        System.out.println(d);  //1.0555555555565555E20

        System.out.println(Float.MIN_VALUE);    //1.4E-45, minimum positive value closest to zero
        System.out.println(Float.MAX_VALUE);    //3.4028235E38

        System.out.println(Double.MIN_VALUE);   //4.9E-324, minimum positive value closest to zero
        System.out.println(Double.MAX_VALUE);   //1.7976931348623157E308
    }
}
