package com.wipro.komal.java8features;

import java.util.*;
import java.util.stream.*;

public class EvenNumberCollector {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 10, 12, 15, 18);

        // Filter even numbers and collect them into a new list
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
