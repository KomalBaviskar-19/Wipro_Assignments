package com.wipro.komal.java8features;

import java.util.*;
import java.util.stream.Collectors;

public class PrettyJoiner {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Pune", "Nashik", "Nagpur");

        // Join city names with commas
        String result = cities.stream()
                              .collect(Collectors.joining(", "));

        System.out.println("Cities: " + result);
    }
}
