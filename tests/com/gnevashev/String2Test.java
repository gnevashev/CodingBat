package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {
    String2 s = new String2();

    //Return the number of times that the string "hi" appears anywhere in the given string.
    @Test
    void countHi() {
        assertEquals(1, s.countHi("abc hi ho"));
        assertEquals(2, s.countHi("ABChi hi"));
        assertEquals(2, s.countHi("hihi"));
    }

    //Given a string, return a string where for every char in the original, there are two chars.
    @Test
    void doubleChar() {
        assertEquals("TThhee", s.doubleChar("The"));
        assertEquals("AAAAbbbb", s.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", s.doubleChar("Hi-There"));
    }

}