package com.java.oops.innerclass.memberclass;

public class Car {
    private final String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine {   //inner class
        void start() {
            if (isEngineOn) {
                System.out.println(model + " already on.");
            } else {
                isEngineOn = true;
                System.out.println(model + " started.");
            }
        }

        void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " stopped.");
            } else {
                System.out.println(model + " already stop.");
            }
        }
    }
}
