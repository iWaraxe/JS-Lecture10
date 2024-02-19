package com.coherentsolutions.section2.example2;

// MathApplicationTest.java
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class MathApplicationTest {

    @Test
    public void testAdd() {
        // Create mock object of Calculator
        Calculator calculatorMock = mock(Calculator.class);

        // Configure mock to return a specific value
        when(calculatorMock.add(10.0, 20.0)).thenReturn(30.0);
        when(calculatorMock.add(20.0, 20.0)).thenReturn(40.0);

        // Create MathApplication object and set the mock Calculator
        MathApplication mathApp = new MathApplication();
        mathApp.setCalculator(calculatorMock);

        // Perform the test
        double result = mathApp.add(10.0, 20.0);
        assertEquals(30.0, result, 0);

        // Verify if the method was called on the mock
        verify(calculatorMock).add(10.0, 20.0);
    }
}

