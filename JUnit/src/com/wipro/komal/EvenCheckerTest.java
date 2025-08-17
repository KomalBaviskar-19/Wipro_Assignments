package com.wipro.komal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EvenCheckerTest {

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    @Test
    @DisplayName("Test even numbers")
    void testEvenNumber() {
        EvenCheckerTest result = new EvenCheckerTest();
        assertTrue(result.isEven(8));  
        assertFalse(result.isEven(7));

    }
    
    @Test
    void testObj() {
    	String str = new String("Hello");
    	assertNotNull(str);
    }

}