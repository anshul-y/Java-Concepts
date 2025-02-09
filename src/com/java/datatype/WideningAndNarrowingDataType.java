package com.java.datatype;

public class WideningAndNarrowingDataType {
    public static void main(String[] args) {
//        int i= 123;
//        System.out.println(i);
//        long l = i;
//        System.out.println(l);
//        float f = l;    //auto-casting, no loss of data
//        System.out.println(f);
//
//        float fl = 1.7f;
//        int a = (int) fl;   //no auto-casting, loss of data, so type-casting
//        System.out.println(a);

//        //Widening conversion/ Implicit conversion
//        byte byteValue = 10;            //1 byte
//        short shortValue = byteValue;   //2 byte
//        int intValue = shortValue;      //4 byte
//        long longValue = intValue;      //8 byte
//        float floatValue = longValue;   //4 byte
//        double doubleValue = floatValue;//8 byte
//
//        System.out.println("byte: "+byteValue); //10
//        System.out.println("short: "+shortValue);   //10
//        System.out.println("int: "+intValue);   //10
//        System.out.println("long: "+longValue); //10
//        System.out.println("float: "+ floatValue);  //10.0
//        System.out.println("double: " + doubleValue);   //10.0

        //Narrowing Conversion
        double doubleValue = 123.456;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        System.out.println(doubleValue);    //123.456
        System.out.println(floatValue); //123.456
        System.out.println(longValue);  //123
        System.out.println(intValue);   //123

        long a = Long.MAX_VALUE;    //8 byte, 32 bit
        System.out.println(a);  //9223372036854775807
        System.out.println(Long.toBinaryString(a));  //01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        int b = (int) a;    //4 byte
        System.out.println(b);  //-1
        System.out.println(Integer.toBinaryString(b));  //11111111 11111111 11111111 11111111



    }
}
