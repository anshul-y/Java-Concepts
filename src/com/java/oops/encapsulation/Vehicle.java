package com.java.oops.encapsulation;

public class Vehicle {

    private String color;
    private String brand;
    private String model;
    private int year;
    int speed;

    //getter setter...
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int increment) {
        this.speed += increment;
    }

    public void brake(int decrement) {
        this.speed -= decrement;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}

/*public static void main(String[] args) {
    Vehicle car = new Vehicle();
    car.setColor("Blue");
    car.setBrand("Tata");
    car.setModel("Safari");
    car.setYear(2024);
    car.setSpeed(40);

    car.accelerate(1);
    System.out.println(car.speed); //41
}*/
