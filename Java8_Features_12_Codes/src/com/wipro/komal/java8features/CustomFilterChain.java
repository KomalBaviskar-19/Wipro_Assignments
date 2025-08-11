package com.wipro.komal.java8features;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomFilterChain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anita", "Komal", "Asha", "Alina", "Amit");

        // Predicate 1: Name starts with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");

        // Predicate 2: Name ends with 'a'
        Predicate<String> endsWithA = name -> name.endsWith("a");

        // Chain predicates using .and()
        List<String> filteredNames = names.stream()
            .filter(startsWithA.and(endsWithA))
            .collect(Collectors.toList());

        System.out.println("Filtered Names: " + filteredNames);
    }
}
