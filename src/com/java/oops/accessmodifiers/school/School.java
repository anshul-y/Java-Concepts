package com.java.oops.accessmodifiers.school;

//Private constructor (Singleton Pattern)
public class School {
    private static School instance;

    private School() {  //private constructor
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }
}
