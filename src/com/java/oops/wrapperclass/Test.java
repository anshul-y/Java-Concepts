package com.java.oops.wrapperclass;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int a = 1; //primitive data type, store in stack
        Integer b = 1; //reference variable, store in heap memory, bcoz b is object, does autoboxing
        //Integer b = Integer.valueOf(1);   //internally, called boxing
        Integer c = 1; //auto-boxing, internally Integer.valueOf(1)
        int d = c;   //auto-unboxing, internally .intValue()
        //List<int> list = new ArrayList<>(); //Type argument cannot be of primitive type
        List<Integer> list = new ArrayList<>();


        Integer one = 1;
        func(one);
        System.out.println(one);    //print 1, one is storing the same reference value

        Student student = new Student();
        student.id = 1;
        func(student);
        //System.out.println(student.id); //case 1,print 1, student is pointing to the same object with id 1
        System.out.println(student.id); //case 2,print 2, student is pointing to the same object with id 2 changed in func()
    }

    static void func(Integer two) {
        two = 2;    //reference value is changed for two and now storing the reference of 2
    }

    static void func(Student std) {
        //Student student1 = new Student();
        //student1.id = 2;
        //student = student1; //case 1, object reference is changed for std, not student
        std.id = 2; //case 2, changing the reference object value i.e., student in main class
    }
}

class Student {
    public int id;
}
