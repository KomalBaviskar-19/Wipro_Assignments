package com.wipro.komal.java8features;

//Step 1: Create interface with one abstract and one default method
interface Power {
    void turnOn(); // abstract method

    default void showPower() {
        System.out.println("Default Power: 100W");
    }
}

// Step 2: Implement the interface in a class
class Device implements Power {
    public void turnOn() {
        System.out.println("Device is now ON.");
    }
}

// Step 3: Call both methods
public class DefaultMethodDemo1 {
    public static void main(String[] args) {
        Device d = new Device();
        d.turnOn();       // calling abstract method
        d.showPower();    // calling default method
    }
}
