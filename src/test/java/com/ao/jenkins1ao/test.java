package com.ao.jenkins1ao;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class test {


    @Test
    public void create(){
        Person person = new Person("ALi");

        String actual = person.getName();

        String expected = "ALi";

        assertEquals(expected, actual);
    }
}
