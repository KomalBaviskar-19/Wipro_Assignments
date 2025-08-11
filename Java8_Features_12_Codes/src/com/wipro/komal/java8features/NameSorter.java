package com.wipro.komal.java8features;

import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        // Step 1: Create a list of 5 names
        List<String> names = Arrays.asList("Komal", "Amit", "Sneha", "Rohit", "Bhavesh");

        // Step 2: Sort using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Step 3: Print the sorted names
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
