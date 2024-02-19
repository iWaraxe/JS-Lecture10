package com.coherentsolutions.section2.example3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class SimpleListTest {

    @Test
    public void testSpyOnAddItem() {
        // Step 1: Create a real object instance
        SimpleList realList = new SimpleList();

        // Step 2: Create a spy of the real object
        SimpleList spyList = spy(realList);

        // Step 3: Perform operations on the spy
        spyList.addItem(5);
        spyList.addItem(5);  // Call it a second time
        spyList.addItem(10);

        // Step 4: Verify interactions
        verify(spyList, times(2)).addItem(5);  // Method should be called twice
        verify(spyList, times(1)).addItem(10); // Method should be called once

        // Step 5: Validate the state of the real object
        assertEquals(3, spyList.getSize(), "List size should be 3"); // Real method is called
    }
}