package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String3Test {

    String3 s = new String3();

    //Given a string, return true if the number of appearances of "is" anywhere in the string is
    //equal to the number of appearances of "not" anywhere in the string (case sensitive).
    @Test
    void equalIsNot() {
        assertFalse(s.equalIsNot("This is not"));
        assertTrue(s.equalIsNot("This is notnot"));
        assertTrue(s.equalIsNot("noisxxnotyynotxisi"));
        assertTrue(s.equalIsNot(""));
    }

    //Given two strings, base and remove, return a version of the base string where all
    //instances of the remove string have been removed (not case sensitive). You may assume
    //that the remove string is length 1 or more. Remove only non-overlapping instances, so
    //with "xxx" removing "xx" leaves "x".
    @Test
    void withoutString() {
        assertEquals("He there", s.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", s.withoutString("Hello there", "e"));
        assertEquals("Hello there", s.withoutString("Hello there", "x"));
        assertEquals("Th  a FH", s.withoutString("This is a FISH", "IS"));
        assertEquals("xzz", s.withoutString("xyzzy", "Y"));
        assertEquals("TH  a FH", s.withoutString("THIS is a FISH", "iS"));
        assertEquals("THIS  a FISH", s.withoutString("THIS is/ a FISH", "iS/"));
    }

    //Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
    //the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
    //is at the end of a word if there is not an alphabetic letter immediately following it.
    //Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    @Test
    void countYZ() {
        assertEquals(2, s.countYZ("fez day"));
        assertEquals(2, s.countYZ("day fez"));
        assertEquals(2, s.countYZ("day fyyyz"));
        assertEquals(2, s.countYZ("day fyyyz asa"));
        assertEquals(3, s.countYZ("day!!!fyyyz!!!asy"));
        assertEquals(2, s.countYZ("y2bz"));

    }

}