package com.wipro.komal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


import org.junit.jupiter.api.Test;

public class After_All {
	
	 @AfterAll
	static void greetAfterAll() {
	System.out.println("Good Morning !");
	 }
	        
	@Test
    void greet() {
        System.out.println("Ramesh");
    }

    @Test
    void greet1() {
        System.out.println("Suresh");
    }

    @Test
    void greet2() {
        System.out.println("Raju");
    }
    
    @BeforeAll
        
    static void greetBeforeAll() {
    System.out.println("Hello");
     }
   
}