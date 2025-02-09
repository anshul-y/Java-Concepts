package com.java.oops.polymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void sayBye(){
        System.out.println("Woof Woof");
    }
}
