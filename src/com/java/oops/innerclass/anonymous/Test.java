package com.java.oops.innerclass.anonymous;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(150);
        //CreditCard card = new CreditCard();
        //cart.processPayment(card);    //150 is paid via Credit Card.
        cart.processPayment(new Payment() {     //anonymous inner class
            @Override
            public void pay(int amount) {
                System.out.println(amount+" is paid via Credit Card.");
            }
        });
    }
}
