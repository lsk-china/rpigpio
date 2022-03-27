package com.example.demo;

public class GPIO {
    public native void setup();
    public native void on();
    public native void off();

    static {
        System.loadLibrary("gpiotest");
    }
}
