package com.wipro.komal.java8features;

import java.util.*;
//import java.util.stream.*;

public class WordCounter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Komal", "Aniruddha", "Snehal", "Amit", "Bhavesh");

        // Count names longer than 5 characters
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();

        System.out.println("Number of names longer than 5 characters: " + count);
    }
}
