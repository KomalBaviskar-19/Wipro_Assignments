package com.wipro.komal.java8features;

import java.util.*;
import java.util.stream.*;

public class ANameFinder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anita", "Komal", "Amit", "Sneha", "Akash");

        // Use stream to filter names starting with "A"
        List<String> aNames = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .collect(Collectors.toList());

        System.out.println("Names starting with A: " + aNames);
    }
}
