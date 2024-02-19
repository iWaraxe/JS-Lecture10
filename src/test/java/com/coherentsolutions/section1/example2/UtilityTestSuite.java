package com.coherentsolutions.section1.example2;

// UtilityTestSuite.java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        StringManipulatorTest.class
})
public class UtilityTestSuite {
    // This class remains empty and is used only for the above annotations
}
