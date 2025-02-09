package com.java.oops.abstraction;

import com.java.oops.polymorphism.Dog;

//An abstract class in Java is a class that cannot be instantiated (you cannot create objects of it)
//and is meant to be extended by subclasses.
//It can contain both abstract methods (without implementation) and concrete methods (with implementation).
public abstract class Animal {

    private String name;
    private int age;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public abstract void makeSound(); //abstract method
    //abstract void makeSound(); //can be accessed in same package but subclass cannot override, have to make subclass abstract  class
    //protected abstract void makeSound(); //can be accessed in same package and subclass can override

    public void sleep(){    //concrete method
        System.out.println("zzz..");
    }
}
