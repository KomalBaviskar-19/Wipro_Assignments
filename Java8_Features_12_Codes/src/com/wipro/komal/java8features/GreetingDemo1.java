
package com.wipro.komal.java8features;

//Step 1: Define a functional interface
@FunctionalInterface
interface MessagePrinter {
    void printMessage();
}

public class GreetingDemo1 {

    // Step 2: Method that accepts functional interface
    public static void greet(MessagePrinter printer) {
        printer.printMessage();
    }

    public static void main(String[] args) {
        // Step 3: Pass lambda expression (message printer) to the method
        greet(() -> System.out.println("Hello! Welcome to Java Functional Interfaces."));
    }
}
