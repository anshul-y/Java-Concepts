package com.java.oops.innerclass.memberclass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        //Engine is the property on Car
        //Engine object created with the help of instance of outer class
        Car.Engine engine = car.new Engine();
        engine.start(); //Tata Safari started.
        engine.stop();  //Tata Safari stopped.
    }
}
