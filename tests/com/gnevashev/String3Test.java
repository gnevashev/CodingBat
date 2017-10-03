package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String3Test {

    String3 s = new String3();

    //Given a string, return a string where every appearance of the lowercase word "is" has been
    //replaced with "is not". The word "is" should not be immediately preceeded or followed by a
    //letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
    //tests if a char is a letter.)
    @Test
    void notReplace() {
        assertEquals("is not test", s.notReplace("is test"));
        assertEquals("is not-is not", s.notReplace("is-is"));
        assertEquals("This is not right", s.notReplace("This is right"));
    }

    //Given a string, return the sum of the numbers appearing in the string, ignoring all other
    //characters. A number is a series of 1 or more digit chars in a row. (Note:
    //Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    //Integer.parseInt(string) converts a string to an int.)
    @Test
    void sumNumbers() {
        assertEquals(123, s.sumNumbers("abc123xyz"));
        assertEquals(44, s.sumNumbers("aa11b33"));
        assertEquals(18, s.sumNumbers("7 11"));
    }

    //Given a string, return the length of the largest "block" in the string. A block is a run of
    //adjacent chars that are the same.
    @Test
    void maxBlock() {
        assertEquals(2, s.maxBlock("hoopla"));
        assertEquals(3, s.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, s.maxBlock(""));
        assertEquals(1, s.maxBlock("x"));
        assertEquals(2, s.maxBlock("xxyz"));
        assertEquals(4, s.maxBlock("XXBBBbbxxXXXX"));
    }

    //Given a string, look for a mirror image (backwards) string at both the beginning and end of
    //the given string. In other words, zero or more characters at the very begining of the given
    //string, and at the very end of the string in reverse order (possibly overlapping). For
    //example, the string "abXYZba" has the mirror end "ab".
    @Test
    void mirrorEnds() {
        assertEquals("ab", s.mirrorEnds("abXYZba"));
        assertEquals ("a", s.mirrorEnds("abca"));
        assertEquals ("aba", s.mirrorEnds("aba"));
    }

    //Given a string, return the longest substring that appears at both the beginning and end of
    //the string without overlapping. For example, sameEnds("abXab") is "ab".
    @Test
    void sameEnds() {
        assertEquals("ab", s.sameEnds("abXab"));
        assertEquals("x", s.sameEnds("xx"));
        assertEquals("ab", s.sameEnds("abXYab"));
        assertEquals("x", s.sameEnds("xxx"));
    }

    //Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
    //Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
    //Integer.parseInt(string) converts a string to an int.
    @Test
    void sumDigits() {
        assertEquals(6, s.sumDigits("aa1bc2d3"));
        assertEquals(8, s.sumDigits("aa11b33"));
        assertEquals(0, s.sumDigits("Chocolate"));
    }

    //We'll say that a "triple" in a string is a char appearing three times in a row.
    //Return the number of triples in the given string. The triples may overlap.
    @Test
    void countTriple() {
        assertEquals(1, s.countTriple("abcXXXabc"));
        assertEquals(3, s.countTriple("xxxabyyyycd"));
        assertEquals(0, s.countTriple("a"));
    }

    //We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its
    //left or right. Return true if all the g's in the given string are happy.
    @Test
    void gHappy() {
        assertTrue(s.gHappy("xxggxx"));
        assertFalse(s.gHappy("xxgxx"));
        assertFalse(s.gHappy("xxggyygxx"));
    }

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