package com.gnevashev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String1Test {

    String1 w = new String1();

    //Given a string, if the first or last chars are 'x', return the string
    //without those 'x' chars, and otherwise return the string unchanged.
    @Test
    void withoutX() {
        assertEquals("Hi", w.withoutX("xHix"));
        assertEquals("Hi", w.withoutX("xHi"));
        assertEquals("Hxi", w.withoutX("Hxix"));
    }

    //Given a string and a second "word" string, we'll say that the word matches the string if it appears at the
    //front of the string, except its first char does not need to match exactly. On a match, return the front of
    //the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi"
    //and "xip" returns "hip". The word will be at least length 1
    @Test
    void startWord() {
        assertEquals("hi", w.startWord("hippo", "hi"));
        assertEquals("hip", w.startWord("hippo", "xip"));
        assertEquals("h", w.startWord("hippo", "i"));
    }

    //Given a string, return a version without the first 2 chars.
    //Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // The string may be any length. Harder than it looks.
    @Test
    void deFront() {
        assertEquals("llo", w.deFront("Hello"));
        assertEquals("va", w.deFront("java"));
        assertEquals("aay", w.deFront("away"));
        assertEquals("abby", w.deFront("abby"));
        assertEquals("bby", w.deFront("qbby"));
    }

    //Given a string, if a length 2 substring appears at both its beginning and end,
    // return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
    //The substring may overlap with itself, so "Hi" yields "".
    //Otherwise, return the original string unchanged.
    @Test
    void without2() {
        assertEquals("lloHe", w.without2("HelloHe"));
        assertEquals("lloHelloHe", w.without2("HelloHelloHe"));
        assertEquals("HelloHi", w.without2("HelloHi"));
        assertEquals("", w.without2("Hi"));
    }

    //Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    //The string may be any length. If there are fewer than 2 chars, use whatever is there.
    @Test
    void extraFront() {
        assertEquals("HeHeHe", w.extraFront("Hello"));
        assertEquals("ababab", w.extraFront("ab"));
        assertEquals("HHH", w.extraFront("H"));
    }

    //Given two strings, append them together (known as "concatenation") and return the result.
    //However, if the strings are different lengths, omit chars from the longer string
    //so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
    //The strings may be any length.
    @Test
    void minCat() {
        assertEquals("loHi", w.minCat("Hello", "Hi"));
        assertEquals("ellojava", w.minCat("Hello", "java"));
        assertEquals("javaello", w.minCat("java", "Hello"));
    }

    //Given a string, return true if the first 2 chars in the string
    //also appear at the end of the string, such as with "edited".
    @Test
    void frontAgain() {
        assertTrue(w.frontAgain("edited"));
        assertTrue(w.frontAgain("ed"));
        assertFalse(w.frontAgain("edit"));
        assertFalse(w.frontAgain(""));
    }

    //Given a string, if the string begins with "red" or "blue"
    //return that color string, otherwise return the empty string.
    @Test
    void seeColor() {
        assertEquals("red", w.seeColor("redxx"));
        assertEquals("", w.seeColor("xxred"));
        assertEquals("blue", w.seeColor("blueTimes"));
    }

    //Given a string of any length, return a new string where the last 2 chars,
    //if present, are swapped, so "coding" yields "codign".
    @Test
    void lastTwo() {
        assertEquals("codign", w.lastTwo("coding"));
        assertEquals("cta", w.lastTwo("cat"));
        assertEquals("ba", w.lastTwo("ab"));
        assertEquals("a", w.lastTwo("a"));
        assertEquals("", w.lastTwo(""));
    }

    //Given two strings, append them together (known as "concatenation") and return the result.
    //However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    @Test
    void conCat() {
        assertEquals("abcat", w.conCat("abc", "cat"));
        assertEquals("dogcat", w.conCat("dog", "cat"));
        assertEquals("abc", w.conCat("abc", ""));
    }

    //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    //so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    @Test
    void lastChars() {
        assertEquals("ls", w.lastChars("last", "chars"));
        assertEquals("ya", w.lastChars("yo", "java"));
        assertEquals("h@", w.lastChars("hi", ""));
    }

    //Given a string, return a string length 2 made of its first 2 chars.
    //If the string length is less than 2, use '@' for the missing chars.
    @Test
    void atFirst() {
        assertEquals("@@", w.atFirst(""));
        assertEquals("a@", w.atFirst("a"));
        assertEquals("ab", w.atFirst("ab"));
        assertEquals("zx", w.atFirst("zxc"));
    }

    //Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    //such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    //Note: use .equals() to compare 2 strings.
    @Test
    void hasBad() {
        assertTrue(w.hasBad("badxx"));
        assertTrue(w.hasBad("xbadxx"));
        assertFalse(w.hasBad("xxbadxx"));
    }

    //Given a string of odd length, return the string length 3 from its middle,
    //so "Candy" yields "and". The string length will be at least 3.
    @Test
    void middleThree() {
        assertEquals("and", w.middleThree("Candy"));
        assertEquals("and", w.middleThree("and"));
        assertEquals("lvi", w.middleThree("solving"));
    }

    //Given a string of even length, return a string made of the middle two chars,
    // so the string "string" yields "ri". The string length will be at least 2.
    @Test
    void middleTwo() {
        assertEquals("ri", w.middleTwo("string"));
        assertEquals("od", w.middleTwo("code"));
        assertEquals("ct", w.middleTwo("Practice"));
    }

    //Given a string and an index, return a string length 2 starting at the given index.
    //If the index is too big or too small to define a string length 2, use the first 2 chars.
    //The string length will be at least 2.
    @Test
    void twoChar() {
        assertEquals("ja", w.twoChar("java", 0));
        assertEquals("va", w.twoChar("java", 2));
        assertEquals("ja", w.twoChar("java", 3));
        assertEquals("ja", w.twoChar("java", -1));
        assertEquals("ja", w.twoChar("java", 15));
    }

    //Given a string and an int n, return a string made of the first and last n chars from the string.
    //The string length will be at least n.
    @Test
    void nTwice() {
        assertEquals("Helo", w.nTwice("Hello", 2));
        assertEquals("Choate", w.nTwice("Chocolate", 3));
        assertEquals("Ce", w.nTwice("Chocolate", 1));
    }

    //Given a string, return true if it ends in "ly".
    @Test
    void endsLy() {
        assertTrue(w.endsLy("oddly"));
        assertFalse(w.endsLy("y"));
        assertFalse(w.endsLy(""));
        assertFalse(w.endsLy("oddy"));
    }

    //Given a string, return a version without both the first and last char of the string.
    // The string may be any length, including 0.
    @Test
    void withouEnd2() {
        assertEquals("ell", w.withouEnd2("Hello"));
        assertEquals("b", w.withouEnd2("abc"));
        assertEquals("", w.withouEnd2("ab"));
        assertEquals("", w.withouEnd2(""));
    }

    //Given a string, return a string length 1 from its front, unless front is false,
    //in which case return a string length 1 from its back. The string will be non-empty.
    @Test
    void theEnd() {
        assertEquals("H", w.theEnd("Hello", true));
        assertEquals("o", w.theEnd("Hello", false));
        assertEquals("o", w.theEnd("oh", true));
    }

    //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    //The string length will be at least 2.
    @Test
    void right2() {
        assertEquals("loHel", w.right2("Hello"));
        assertEquals("Hi", w.right2("Hi"));
    }

    //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    //The string length will be at least 2.
    @Test
    void left2() {
        assertEquals("lloHe", w.left2("Hello"));
        assertEquals("Hi", w.left2("Hi"));
    }

    //Given 2 strings, return their concatenation, except omit the first char of each.
    //The strings will be at least length 1.
    @Test
    void nonStart() {
        assertEquals("ellohere", w.nonStart("Hello", "There"));
        assertEquals("avaode", w.nonStart("java", "code"));
        assertEquals("", w.nonStart("a", "b"));
    }

    //Given 2 strings, a and b, return a string of the form short+long+short,
    //with the shorter string on the outside and the longer string on the inside.
    //The strings will not be the same length, but they may be empty (length 0).
    @Test
    void comboString() {
      assertEquals("hiHellohi", w.comboString("Hello", "hi"));
      assertEquals("hiHellohi", w.comboString("hi", "Hello"));
      assertEquals("aaa", w.comboString("aaa", ""));
    }

    //Given a string, return a version without the first and last char,
    //so "Hello" yields "ell". The string length will be at least 2.
    @Test
    void withoutEnd() {
        assertEquals("ell", w.withoutEnd("Hello"));
        assertEquals("av", w.withoutEnd("java"));
        assertEquals("odin", w.withoutEnd("coding"));
        assertEquals("", w.withoutEnd("ab"));
    }

    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    @Test
    void firstHalf() {
        assertEquals("Woo", w.firstHalf("WooHoo"));
        assertEquals("Hello", w.firstHalf("HelloThere"));
    }

    @Test
    void withoutX2() {
        assertEquals("Hi", w.withoutX2("xHi"));
        assertEquals("Hi", w.withoutX2("xxHi"));
        assertEquals("", w.withoutX2(""));
        assertEquals("", w.withoutX2("x"));
        assertEquals("H", w.withoutX2("H"));
        assertEquals("Hi", w.withoutX2("Hxi"));
        assertEquals("Hi", w.withoutX2("Hi"));
    }
    @Test
    void firstTwo() {
        assertEquals("", w.firstTwo(""));
        assertEquals("X", w.firstTwo("X"));
        assertEquals("ab", w.firstTwo("abc"));
    }

    @Test
    void extraEnd() {
        assertEquals("lololo", w.extraEnd("Hello"));
        assertEquals("ababab", w.extraEnd("ab"));
        assertEquals("HiHiHi", w.extraEnd("Hi"));
    }

    @Test
    void makeOutWord() {
        assertEquals("<<Yay>>", w.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", w.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", w.makeOutWord("[[]]", "word"));
    }

    @Test
    void makeTags() {
        assertEquals("<i>Yay</i>", w.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", w.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", w.makeTags("cite", "Yay"));
    }

    @Test
    void makeAbba() {
        assertEquals("HiByeByeHi", w.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", w.makeAbba("Yo", "Alice"));
    }
    @Test
    void helloName() {
        assertEquals("Hello Bob!", w.helloName("Bob"));
        assertEquals("Hello X!", w.helloName("X"));
    }

}