package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonCreation() {
        Person p = new Person("aqeel", 27);
        assertEquals("aqeel", p.getName());
        assertEquals(27, p.getAge());
    }

    @Test
    public void testPersonNameNotEmpty() {
        Person p = new Person("adel", 26);
        assertFalse(p.getName().isEmpty());
    }

    @Test
    public void testPersonAgePositive() {
        Person p = new Person("samir", 30);
        assertTrue(p.getAge() > 0);
    }
}
