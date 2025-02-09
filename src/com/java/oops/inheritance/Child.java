package com.java.oops.inheritance;

public class Child extends Parent{
    public Child() {    //first call the default constructor(super()) of parent class
//        super(); //hidden by default
        super(10);//in case of parameterized constructor in parent class, super method need to be overridden
        System.out.println("Child called");
    }

    public void childMethod(){
        System.out.println("Child Method called");
        super.parentMethod(); //super keyword is used to call parent class method
    }
}
