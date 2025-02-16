package com.leszko.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        // Given
        int a = 15;
        int b = 10;
        
        // When
        int result = calculator.sum(a, b);
        
        // Then
        assertEquals(25, result);
    }
}

Continuous-Delivery-with-Docker-and-Jenkins-Second-Edition\Chapter08\sample1\src\test\java\com\leszko\calculator\CalculatorTest.java