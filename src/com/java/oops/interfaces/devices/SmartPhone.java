package com.java.oops.interfaces.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void takePhoto() {
        System.out.println("Take Photo");
    }

    @Override
    public void makeCall() {
        System.out.println("Make Call");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music");
    }
}
