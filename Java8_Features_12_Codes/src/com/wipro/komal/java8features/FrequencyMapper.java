package com.wipro.komal.java8features;

import java.util.*;
import java.util.stream.*;

public class FrequencyMapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Komal", "Amit", "Sneha", "Amit", "Komal", "Komal");

        // Create a map with name frequencies
        Map<String, Long> nameCountMap = names.stream()
            .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println("Name Frequencies: " + nameCountMap);
    }
}
