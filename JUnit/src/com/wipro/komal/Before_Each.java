package com.wipro.komal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Before_Each {

	 @Test
	    void greet() {
	        System.out.println("Sanket");
	    }

	 @Test
	    void greet1() {
	        System.out.println("Sandesh");
	    }

	    @Test
	    void greet2() {
	        System.out.println("Saurabh");
	    }
	    
	    @BeforeEach
	    void greetBeforeAll() {
	        System.out.println("Hello");
	    }
}