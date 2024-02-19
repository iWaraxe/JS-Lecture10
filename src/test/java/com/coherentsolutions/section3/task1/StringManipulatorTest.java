package com.coherentsolutions.section3.task1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringManipulatorTest {
    @Test
    public void testUpperCase() {
        assertEquals("HELLO", "hello".toUpperCase());
    }
}
