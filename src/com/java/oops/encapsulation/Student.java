package com.java.oops.encapsulation;

public class Student {

    private String name; //instance variables/properties/fields
    private int rollNo;
    private int age;

    //default constructor
//    public Student(){}

    //overloaded constructor
    public Student(){
        this.age = 10;
    }

    //parameterized constructor
    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }


    // behaviour
    public void setAge(int age) {
        if(age<0){
            age = 0;
        }
        this.age = age; // this means instance of object on which this method is called
    }

    public int getAge() {return age;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getRollNo() {return rollNo;}

    public void setRollNo(int rollNo) {this.rollNo = rollNo;}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rollNo=").append(rollNo);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
