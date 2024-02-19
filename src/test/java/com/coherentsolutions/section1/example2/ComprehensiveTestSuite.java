package com.coherentsolutions.section1.example2;

// ComprehensiveTestSuite.java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        StringManipulatorTest.class,
        ArrayUtilitiesTest.class
})
public class ComprehensiveTestSuite {
    // This class remains empty, serving as a holder for the above annotations
}
