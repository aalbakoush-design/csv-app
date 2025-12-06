package com.example;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class CSVReaderTest {

    @Test
    public void testReadAllReturnsCorrectSize() throws Exception {
        CSVReader r = new CSVReader();
        List<Person> list = r.readAll("data.csv");  
        assertEquals(2, list.size()); // حسب ملف data.csv الحالي
    }

    @Test
    public void testReadAllReadsCorrectData() throws Exception {
        CSVReader r = new CSVReader();
        List<Person> list = r.readAll("data.csv");

        assertEquals("aqeel", list.get(0).getName());
        assertEquals(27, list.get(0).getAge());
    }

    @Test(expected = Exception.class)
    public void testReadAllThrowsWhenFileMissing() throws Exception {
        CSVReader r = new CSVReader();
        r.readAll("missing-file.csv");
    }
}
