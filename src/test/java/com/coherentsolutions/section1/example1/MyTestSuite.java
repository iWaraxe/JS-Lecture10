package com.coherentsolutions.section1.example1;

// MyTestSuite.java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestClass1.class,
        TestClass2.class,
        TestClass3.class
})
public class MyTestSuite {
    // This class remains empty and is used only for the above annotations
}

