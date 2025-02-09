package com.java.oops.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {

        //In Method Overloading, return type is not considered
        //Signature is Name + Parameter List (return type does not matter)
        //Methods with identical signatures but different return types will cause a compilation error.
        //Invalid Overloading (Same Signature, Different Return Type)
        int sum = add(5, 7);
        System.out.println(sum);

        //Overloading
        int result = add(5, 7, 3);
        System.out.println(result);

        //Static Method
        int[] arr = {1,2,3,4,5};
        int sumArr = add(arr);
        System.out.println(sumArr);

        System.out.println(add(1,2,3,4,5,5,6,7));

        String str = "Hello";
        str = str.concat(" World"); // Creates a new object instead of modifying the original
        System.out.println(str); // Output: "Hello World"

    }

    private static int add(int... arr) { //Signature: add(int... arr)
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }


    private static int add(int a, int b, int c) { //Signature: add(int a, int b, int c)
        return a+b+c;
    }

    static int add(int a, int b) { return a + b;} //Signature: add(int a, int b)
    //static double add(int a, int b) { return a + b; } // Compilation error!

}
