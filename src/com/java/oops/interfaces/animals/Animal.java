package com.java.oops.interfaces.animals;

public interface Animal {

    public static final int MAX_AGE = 15;  //global variables are static final

    public abstract void eat(); //abstract method

    void sleep();   // by default methods are abstract

    public static void info() {     //this method can be accessed from interface only
        //this.eat() //not a part of class instance
        System.out.println("This is a Animal Interface");
    }

    //default method can be access by the class instance without overriding in implemented class
    public default void run(){
        this.eat(); //as this method is called from class instance
        System.out.println("Animal running");
    }
}
