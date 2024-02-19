package com.coherentsolutions.section2.example3;

// ListSpyTest.java
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListSpyTest {

    @Test
    public void testSpyOnList() {
        List<String> realList = new ArrayList<>();
        realList.add("Real Item");
        int listSize = realList.size();
        String fistItem = realList.get(0);

        // Check that the real list is in a good state
        assertEquals(1, listSize, "List size should be 1");
        assertEquals("Real Item", fistItem);

        List<String> spyList = spy(realList);

        // Check that the spy is in a good state
        assertEquals(1, spyList.size());
        assertEquals("Real Item", spyList.get(0));

        // Stubbing size method
        doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());

        // Adding an element to the spy list
        spyList.add("Mockito");
        assertEquals(2, spyList.size()); // This will fail because we have stubbed the size() method to return 100
        assertEquals("Mockito", spyList.get(1));
    }
}
