package com.java.operator;

public class ArithmeticOperator {
    public static void main(String[] args) {

        int iA = 23;
        double dA = 2334;
        double rA = iA + dA;

        float x = 12.4f;
        int z = 234;
        float v = x + z;

        int iq = 438347634;
        long iQ = iq * 24223; //calculated as int
        System.out.println(iQ); //935582670

        long lq = 438347634;
        long lQ = lq * 24223; //calculated as long
        System.out.println(lQ); //10618094738382

        float divA = 10, divB = 5;
        float divResult = divA * divB / 2;
        System.out.println(divResult);
        System.out.println(divA / divB * 2);

        //same precedence operator solve from left -> right
        int opA = 10 * 2 / 5 - 3 + 4;    //20/5-3+4 -> 4-3+4 -> 1+4 -> 5
        int opB = 10 / 2 * 5 + 3 - 4;    //5*5+3-4 -> 25+3-4 -> 28-4 -> 24
        System.out.println(opA);
        System.out.println(opB);

        int a = 10;
        int b = 5;
        //compound assignment operator
        a += 1;

        byte byA = 10;
        byA += 5;   //implicit casting
        System.out.println("Compound Assignment Operator: " + byA);

        a = 1;
        int pre = ++a;  //first increase value then use
        int post = a++; //first use the value then increase
        System.out.println("Pre: " + a++ + " Post: " + ++a);
        int c = b++ + b;
        System.out.println(b);
        System.out.println(c);

        double p = 1.5, q = 2.5, r = 3.5;
        double complexCalculation = (p + q) * (r - q) / (p + r);    //4.0 * 1.0 / 5.0 -> 0.8
        System.out.println(complexCalculation);
    }
}
