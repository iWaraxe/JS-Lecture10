package com.coherentsolutions.section1.example2;

// ArrayUtilitiesTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayUtilitiesTest {
    @Test
    public void testArrayLength() {
        int[] arr = {1, 2, 3};
        assertEquals(3, arr.length);
    }
}
