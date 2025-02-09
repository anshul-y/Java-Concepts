package com.java.oops.staticDemo;

public class Student {
    private String name;
    private int id;
    private int age;

    public static int count = 0;    //static variable

    public Student(){
        count++;
    }

    //static block
    //used for initializing the static
    static {
        System.out.println("Static BLock");
    }

    public static void getCount() { //static method
        //System.out.println(this.count); //this cannot be referenced from a static context
        System.out.println(count);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

}
