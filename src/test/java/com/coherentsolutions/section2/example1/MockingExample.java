package com.coherentsolutions.section2.example1;

// MockingExample.java

import static org.mockito.Mockito.*;

public class MockingExample {

    // What is Mocking?
    // - Definition: Replacing real objects with simulated versions (mocks)
    // - Purpose:
    //   1. Isolation: Isolate the unit of work being tested
    //   2. Control: Have full control over dependencies

    public static void main(String[] args) {
        // Real-world scenario where mocking is beneficial:
        // Example: Testing an e-commerce application's checkout functionality
        // which relies on a third-party payment gateway.

        // Import Mockito package
        // (Assuming Mockito is already added to your project dependencies)

        // Create a mock object for the PaymentGateway interface
        PaymentGateway paymentGatewayMock = mock(PaymentGateway.class);

        // Configure the mock to return a specific value when a method is called
        when(paymentGatewayMock.processPayment(anyDouble())).thenReturn(true);

        // Now you can use this mock in tests to simulate the behavior of a real payment gateway

        // For demonstration, let's use the mock
        boolean paymentStatus = paymentGatewayMock.processPayment(100.00);

        // Output the payment status
        System.out.println("Payment Status: " + (paymentStatus ? "Successful" : "Failed"));
    }
}
