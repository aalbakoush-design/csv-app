package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CSVReaderTest {

    @Test
    public void testReadAll() throws Exception {
        CSVReader reader = new CSVReader();
        List<Person> people = reader.readAll("data.csv");

        assertNotNull(people);
        assertTrue(people.size() >= 2);

        assertEquals("aqeel", people.get(0).getName());
        assertEquals(27, people.get(0).getAge());
    }
}
