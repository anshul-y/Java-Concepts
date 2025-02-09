package com.java.oops.innerclass.staticclass;

public class Computer {
    private String model;
    private String name;
    private OperatingSystem os;

    public Computer(String model, String name, String osName) {
        this.model = model;
        this.name = name;
        this.os = new OperatingSystem(osName);
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem {     //member inner class
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer: "+model+" OS: "+osName);
        }
    }
    static class USB{   //static inner class
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type: "+type);
        }
    }
}
