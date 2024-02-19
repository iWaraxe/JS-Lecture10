package com.coherentsolutions.section2.example4;

// Import JUnit and Mockito packages
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class BestPracticesMocking {

    public static void main(String[] args) {
        // This main method can be used to manually invoke the test
        new BestPracticesMocking().dosAndDontsOfMocking();
    }

    @Test
    public void dosAndDontsOfMocking() {
        // Best Practices: Dos and Don'ts of Mocking
        // 1. Do Isolate Units: Focus on isolating the code under test.
        SimpleList listMock = mock(SimpleList.class); // Isolating the unit under test

        // 2. Don't Over-Mock: Excessive mocking can lead to complex and brittle tests.
        // Avoid mocking classes like 'ArrayList', 'HashMap', etc., that are part of the Java standard library

        // 3. Do Use Spies Judiciously: Use spies when needed but not as a default choice.
        SimpleList listSpy = spy(new SimpleList());  // Using a spy judiciously

        // Mocked method
        when(listMock.getSize()).thenReturn(2);

        // Real method via spy
        listSpy.addItem(5);
        listSpy.addItem(10);

        // Verifications
        assertEquals(2, listMock.getSize());  // Mocked behavior
        assertEquals(2, listSpy.getSize());    // Real behavior
    }
}

// SimpleList class for demonstration
class SimpleList {
    private int size = 0;

    public void addItem(int item) {
        size++;
    }

    public int getSize() {
        return size;
    }
}
