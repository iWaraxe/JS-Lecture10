package com.coherentsolutions.section2.example4;

// Import JUnit and Mockito packages
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class ReliableUnitTests {

    public static void main(String[] args) {
        // This main method can be used to manually invoke the test
        new ReliableUnitTests().keepingUnitTestsReliable();
    }

    @Test
    public void keepingUnitTestsReliable() {
        // Consistency: Ensure mocks and spies return consistent outputs.
        // Readability: Name your mock objects clearly.
        // Verification: Confirm mock methods were called as expected.

        Calculator calculatorMock = mock(Calculator.class);
        calculatorMock.add(10.0, 20.0);
        calculatorMock.add(30.0, 40.0);

        verify(calculatorMock).add(10.0, 20.0);
        verify(calculatorMock).add(30.0, 40.0);
        verifyNoMoreInteractions(calculatorMock);
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
}
