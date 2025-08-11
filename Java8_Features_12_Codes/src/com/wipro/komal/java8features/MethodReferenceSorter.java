package com.wipro.komal.java8features;

import java.util.*;

public class MethodReferenceSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Komal", "Amit", "Sneha", "Bhavesh");

        // Sort using method reference (instead of lambda)
        names.sort(String::compareTo);

        System.out.println("Sorted Names: " + names);
    }
}
