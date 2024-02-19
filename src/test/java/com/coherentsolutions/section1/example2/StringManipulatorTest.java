package com.coherentsolutions.section1.example2;

// StringManipulatorTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringManipulatorTest {
    @Test
    public void testUpperCase() {
        assertEquals("HELLO", "hello".toUpperCase());
    }
}
