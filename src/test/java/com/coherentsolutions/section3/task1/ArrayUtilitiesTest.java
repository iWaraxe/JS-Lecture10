package com.coherentsolutions.section3.task1;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayUtilitiesTest {
    @Test
    public void testArrayLength() {
        int[] arr = {1, 2, 3};
        assertEquals(3, arr.length);
    }
}
