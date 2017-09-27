package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {
    String2 s = new String2();

    //Given two strings, word and a separator sep, return a big string made of count
    //occurrences of the word, separated by the separator string.
    @Test
    void repeatSeparator() {
        assertEquals("WordXWordXWord", s.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", s.repeatSeparator("This", "And", 2));
        assertEquals("This", s.repeatSeparator("This", "And", 1));
        assertEquals("", s.repeatSeparator("AAA", "", 0));
    }

    //Given a string and an int n, return a string made of the first n characters of the string,
    //followed by the first n-1 characters of the string, and so on. You may assume that n is
    //between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
    @Test
    void repeatFront() {
        assertEquals("ChocChoChC", s.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", s.repeatFront("Chocolate", 3));
        assertEquals("IcI", s.repeatFront("Ice Cream", 2));
        assertEquals("", s.repeatFront("Ice Cream", 0));
    }

    //Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    //You may assume that n is between 0 and the length of the string, inclusive.
    @Test
    void repeatEnd() {
        assertEquals("llollollo", s.repeatEnd("Hello", 3));
        assertEquals("lolo", s.repeatEnd("Hello", 2));
        assertEquals("o", s.repeatEnd("Hello", 1));
        assertEquals("", s.repeatEnd("Hello", 0));
    }

    //Given two strings, a and b, create a bigger string made of the first char of a, the first char
    //of b, the second char of a, the second char of b, and so on. Any leftover chars go at the
    //end of the result.
    @Test
    void mixString() {
        assertEquals("axbycz", s.mixString("abc", "xyz"));
        assertEquals("HTihere", s.mixString("Hi", "There"));
        assertEquals("xTxhxexre", s.mixString("xxxx", "There"));
    }

    //We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    //there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
    //One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
    @Test
    void xyBalance() {
        assertTrue(s.xyBalance("aaxbby"));
        assertTrue(s.xyBalance(""));
        assertFalse(s.xyBalance("aaxbb"));
        assertFalse(s.xyBalance("yaaxbb"));
    }

    //Return true if the given string contains a "bob" string, but where the middle 'o' char
    //can be any char.
    @Test
    void bobThere() {
        assertTrue(s.bobThere("abcbob"));
        assertTrue(s.bobThere("b9b"));
        assertFalse(s.bobThere("bac"));
    }

    //Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
    //a period (.). So "xxyz" counts but "x.xyz" does not.
    @Test
    void xyzThere() {
        assertTrue(s.xyzThere("abcxyz"));
        assertFalse(s.xyzThere("abc.xyz"));
        assertTrue(s.xyzThere("xyz.abc"));
    }

    //Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
    //upper/lower case differences (in other words, the computation should not be "case sensitive").
    //Note: str.toLowerCase() returns the lowercase version of a string.
    @Test
    void endOther() {
        assertTrue(s.endOther("Hiabc", "abc"));
        assertTrue(s.endOther("AbC", "HiaBc"));
        assertTrue(s.endOther("abc", "abXabc"));
        assertFalse(s.endOther("abc", "abXzxc"));
    }

    //Return the number of times that the string "code" appears anywhere in the given string,
    //except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    @Test
    void countCode() {
        assertEquals(1, s.countCode("aaacodebbb"));
        assertEquals(2, s.countCode("codexxcode"));
        assertEquals(2, s.countCode("cozexxcope"));
    }

    //Return true if the string "cat" and "dog" appear the same number of times in the given string.
    @Test
    void catDog() {
        assertTrue(s.catDog("catdog"));
        assertFalse(s.catDog("catcat"));
        assertTrue(s.catDog("1cat1cadodog"));
    }

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