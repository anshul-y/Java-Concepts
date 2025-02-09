package com.java.oops.innerclass.staticclass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Latitude", "Win");
        //Computer.OperatingSystem os = computer.new OperatingSystem("Win");
        Computer.OperatingSystem os = computer.getOs();
        os.displayInfo();   //Computer: Dell OS: Win

        Computer.USB usb = new Computer.USB("C");
        usb.displayInfo();  //USB Type: C
    }
}
