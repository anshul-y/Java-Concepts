package com.java.oops.inheritance;

public class Parent extends GrandParent{    //Cannot inherit from final 'GrandParent' class
    public Parent(){}
    public Parent(int a) {
        super(); //hidden by default
        System.out.println("Parent called");
    }

    void parentMethod(){
        System.out.println("Parent Method called");
    }

//    @Override
//    public void getSurname() { // cannot override 'getSurname()' in 'GrandParent', overridden method is final
//        System.out.println("Sharma");
//    }
}
