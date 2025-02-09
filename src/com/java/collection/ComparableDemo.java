package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 3));
        students.add(new Student("Mark", 6));
        students.add(new Student("Nancy", 2));
        students.sort(null);
        System.out.println(students);
    }
}
