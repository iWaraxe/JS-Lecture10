package com.coherentsolutions.section3.task2;

import static org.mockito.Mockito.*;

import com.coherentsolutions.section3.DatabaseService;
import org.junit.Test;

public class CRUDApplicationTest {

    @Test
    public void testCRUDApplication() {
        // Mock the DatabaseService
        DatabaseService dbMock = mock(DatabaseService.class);

        // Configure the mock
        when(dbMock.read()).thenReturn("TestData");

        // Use the mock
        dbMock.create("NewData");
        String data = dbMock.read();
        dbMock.update("UpdatedData");
        dbMock.delete();

        // Verify behavior
        verify(dbMock).create("NewData");
        verify(dbMock).read();
        verify(dbMock).update("UpdatedData");
        verify(dbMock).delete();
    }
}
