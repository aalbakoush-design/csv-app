package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CSVReaderTest {

    @Test
    public void testReadAllReturnsCorrectSize() throws Exception {
        CSVReader r = new CSVReader();
        List<Person> list = r.readAll("data.csv");
        assertEquals(2, list.size());
    }

    @Test
    public void testReadAllReadsCorrectData() throws Exception {
        CSVReader r = new CSVReader();
        List<Person> list = r.readAll("data.csv");

        assertEquals("aqeel", list.get(0).getName());
        assertEquals(27, list.get(0).getAge());
    }

    @Test
    public void testReadAllThrowsWhenFileMissing() {
        CSVReader r = new CSVReader();
        assertThrows(Exception.class, () -> r.readAll("missing-file.csv"));
    }
}
