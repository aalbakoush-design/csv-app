package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonData() {
        Person p = new Person("Ali", 30);

        assertEquals("Ali", p.getName());
        assertEquals(30, p.getAge());
    }
}
