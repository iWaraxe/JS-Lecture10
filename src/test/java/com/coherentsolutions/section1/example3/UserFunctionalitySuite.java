package com.coherentsolutions.section1.example3;

// UserFunctionalitySuite.java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// This suite is for testing all user-related functionalities
@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserAuthenticationTest.class,
        PaymentProcessingTest.class
})
public class UserFunctionalitySuite {
    // This class remains empty and is used only for the above annotations
}

