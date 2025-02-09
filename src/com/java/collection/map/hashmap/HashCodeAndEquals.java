package com.java.collection.map.hashmap;

import com.java.collection.Student;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Student student1 = new Student("John", 1);
        Student student2 = new Student("Mark", 2);
        Student student3 = new Student("John", 1);

        Map<Student, String> map = new HashMap<>();
        map.put(student1, "Value 1");
        map.put(student2, "Value 2");
        map.put(student3, "Value 3");
        System.out.println("map: " + map.size());
        System.out.println(map.get(student1));
        System.out.println(map.get(student3));
        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student1.hashCode(): " + student1.hashCode());
        System.out.println("student3.hashCode(): " + student3.hashCode());
    }
}

