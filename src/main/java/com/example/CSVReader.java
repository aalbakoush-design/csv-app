package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    /**
     * Reads the first line of the CSV file (usually the header)
     */
    public String readFirstLine(String filePath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        br.close();
        return line;
    }

    /**
     * Reads all rows from a CSV file and returns a list of Person objects.
     */
    public List<Person> readAll(String filePath) throws Exception {

        List<Person> persons = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        boolean skipHeader = true;

        while ((line = br.readLine()) != null) {

            if (skipHeader) {
                skipHeader = false;
                continue;  // Skip first CSV header line
            }

            String[] parts = line.split(",");
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());

            persons.add(new Person(name, age));
        }

        br.close();
        return persons;
    }
}
