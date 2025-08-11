package com.wipro.komal.java8features;

import java.util.*;
//import java.util.stream.*;

public class ParallelSquarePrinter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Print squares using parallel stream
        numbers.parallelStream()
               .forEach(n -> System.out.println("Square of " + n + " is " + (n * n) +
                                                " | Thread: " + Thread.currentThread().
                                                getName()));
    }
}
