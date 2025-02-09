package com.java.oops.innerclass.anonymous;

public class CreditCard implements Payment{

    @Override
    public void pay(int amount){
        System.out.println(amount + " is paid via credit card.");
    }
}
