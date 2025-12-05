package com.example;

public class App {
    public static void main(String[] args) throws Exception {
        CSVReader r = new CSVReader();
        String line = r.readFirstLine("data.csv");
        System.out.println("First line = " + line);
    }
}
