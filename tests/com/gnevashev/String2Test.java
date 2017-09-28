package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String2Test {
    String2 s = new String2();

    //Given a string and a non-empty word string, return a string made of each char just before
    //and just after every appearance of the word in the string. Ignore cases where there is no
    //char before or after the word, and a char may be included twice if it is between two words.
    @Test
    void wordEnds() {
        assertEquals("c13i", s.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", s.wordEnds("XY123XY", "XY"));
        assertEquals("11", s.wordEnds("XY1XY", "XY"));
    }

    //Given a string and a non-empty word string, return a version of the original String where
    //all chars have been replaced by pluses ("+"), except for appearances of the word string
    //which are preserved unchanged.
    @Test
    void plusOut() {
        assertEquals("++xy++", s.plusOut("12xy34", "xy"));
        assertEquals("1+++++", s.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", s.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("+++++++XYZ", s.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++++", s.plusOut("12xy34", ""));
    }

    //Return a version of the given string, where for every star (*) in the string the star and the
    //chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also
    //yields "ad".
    @Test
    void starOut() {
        assertEquals("ad", s.starOut("ab*cd"));
        assertEquals("ad", s.starOut("ab**cd"));
        assertEquals("silly", s.starOut("sm*eilly"));
        assertEquals("string", s.starOut("stringy*"));
        assertEquals("tringy", s.starOut("*stringy"));
        assertEquals("", s.starOut("*"));
    }

    //Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending
    //with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap"
    //yields "zpXzp".
    @Test
    void zipZap() {
        assertEquals("zpXzp", s.zipZap("zipXzap"));
        assertEquals("zpzp", s.zipZap("zopzop"));
        assertEquals("zzzpzp", s.zipZap("zzzopzop"));
    }

    //Given a string, compute a new string by moving the first char to come after the next two
    //chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so
    //"abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
    @Test
    void oneTwo() {
        assertEquals("bca", s.oneTwo("abc"));
        assertEquals("cat", s.oneTwo("tca"));
        assertEquals("catdog", s.oneTwo("tcagdo"));
    }

    //Returns true if for every '*' (star) in the string, if there are chars both immediately
    //before and after the star, they are the same.
    @Test
    void sameStarChar() {
        assertTrue(s.sameStarChar("xy*yzz"));
        assertFalse(s.sameStarChar("xy*zzz"));
        assertTrue(s.sameStarChar("*xa*az"));
    }

    //A sandwich is two pieces of bread with something in between. Return the string that is
    //between the first and last appearance of "bread" in the given string, or return the empty
    //string "" if there are not two pieces of bread.
    @Test
    void getSandwich() {
        assertEquals("jam", s.getSandwich("breadjambread"));
        assertEquals("jam", s.getSandwich("xxbreadjambreadyy"));
        assertEquals("", s.getSandwich("xxbreadyy"));
    }

    //Given a string, does "xyz" appear in the middle of the string? To define middle,
    //we'll say that the number of chars to the left and right of the "xyz" must differ
    //by at most one. This problem is harder than it looks.
    @Test
    void xyzMiddle() {
        assertTrue(s.xyzMiddle("AAxyzBB"));
        assertTrue(s.xyzMiddle("AxyzBB"));
        assertTrue(s.xyzMiddle("AAxyzB"));
        assertFalse(s.xyzMiddle("AxyzBBB"));
    }

    //Given a string, consider the prefix string made of the first N chars of the string.
    //Does that prefix string appear somewhere else in the string?
    //Assume that the string is not empty and that N is in the range 1..str.length()
    @Test
    void prefixAgain() {
        assertTrue(s.prefixAgain("abXYabc", 1));
        assertTrue(s.prefixAgain("abXYabc", 2));
        assertFalse(s.prefixAgain("abXYabc", 3));
    }

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