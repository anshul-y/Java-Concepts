package com.java.oops.innerclass.anonymous;

public class ShoppingCart {
    private int amount;

    public ShoppingCart(int amount) {
        this.amount = amount;
    }

    public void processPayment(Payment payment){
        payment.pay(amount);
    }
}
