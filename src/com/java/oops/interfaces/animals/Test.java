package com.java.oops.interfaces.animals;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();

        Animal dog1 = new Dog();
        dog1.eat();

        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        //Dog.info(); //Static method may only be called on its containing interface
        Animal.info();

        dog.run();
        //Animal.run();   //Non-static method 'run()' cannot be referenced from a static context
    }
//Dog is sleeping
//Dog is eating
//15
//15
//This is a Animal Interface
//Dog is eating
//Animal running
}
