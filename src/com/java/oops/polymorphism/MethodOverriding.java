package com.java.oops.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();    //Some sound

        Animal dog = new Dog();
        dog.makeSound();    //Woof
        //dog.sayBye(); //not accessible

        Animal cat = new Cat();
        cat.makeSound();    //Meow
    }
}
