package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {
    private Map2 m = new Map2();

    private HashMap<String, Integer> map = new HashMap<>();
    private HashMap<String, Integer> expected = new HashMap<>();

    //We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    //Loop over and then return the given array of non-empty strings as follows: if a string
    //matches an earlier string in the array, swap the 2 strings in the array. A particular first
    //char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
    //Using a map, this can be solved making just one pass over the array. More difficult than it looks.
    @Test
    void firstSwap() {
        assertArrayEquals(new String[]{"ac", "ab"}, m.firstSwap(new String[]{"ab", "ac"}));
        assertArrayEquals(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}, m.firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));
        assertArrayEquals(new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"}, m.firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));

    }

    //We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
    //Loop over and then return the given array of non-empty strings as follows: if a string
    //matches an earlier string in the array, swap the 2 strings in the array. When a position
    //in the array has been swapped, it no longer matches anything. Using a map, this can be solved
    //making just one pass over the array. More difficult than it looks.
    @Test
    void allSwap() {
        assertArrayEquals(new String[]{"ac", "ab"}, m.allSwap(new String[]{"ab", "ac"}));
        assertArrayEquals(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}, m.allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));
        assertArrayEquals(new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}, m.allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));
    }

    //Given an array of strings, return a Map<String, Boolean> where each different string is
    //a key and its value is true if that string appears 2 or more times in the array.
    @Test
    void wordMultiple() {
        Map<String, Boolean> expected = new HashMap<>();
        //testcase1
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        map.clear();
        expected.clear();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        assertEquals(expected, m.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));

        //testcase2
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        expected.clear();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);
        assertEquals(expected, m.wordMultiple(new String[]{"c", "b", "a"}));

        //testcase3
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        expected.clear();
        expected.put("c", true);
        assertEquals(expected, m.wordMultiple(new String[]{"c", "c", "c", "c"}));

    }

    //Loop over the given array of strings to build a result string like this: when a string appears
    //the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
    //Return the empty string if no string appears a 2nd time.
    @Test
    void wordAppend() {
        assertEquals("a", m.wordAppend(new String[]{"a", "b", "a"}));
        assertEquals("aa", m.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        assertEquals("a", m.wordAppend(new String[]{"a", "", "a"}));
    }

    //Given an array of non-empty strings, return a Map<String, String> with a key for every
    //different first character seen, with the value of all the strings starting with that character
    //appended together in the order they appear in the array.
    @Test
    void firstChar() {
        Map<String, String> expected = new HashMap<>();
        //testcase1
        //firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
        map.clear();
        expected.clear();
        expected.put("s", "saltsoda");
        expected.put("t", "teatoast");

        assertEquals(expected, m.firstChar(new String[]{"salt", "tea", "soda", "toast"}));

        //testcase2
        //firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        expected.clear();
        expected.put("a", "aaaAA");
        expected.put("b", "bb");
        expected.put("c", "cccCC");
        expected.put("d", "d");
        assertEquals(expected, m.firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));

        //testcase3
        //firstChar([]) → {}
        expected.clear();
        assertEquals(expected, m.firstChar(new String[]{}));
    }

    //The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
    //with a key for each different string, with the value the number of times that string appears in the array.
    @Test
    void wordCount() {
        //testcase1
        //wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
        map.clear();
        expected.clear();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        assertEquals(expected, m.wordCount(new String[]{"a", "b", "a", "c", "b"}));

        //testcase2
        //wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
        expected.clear();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        assertEquals(expected, m.wordCount(new String[]{"c", "b", "a"}));

        //testcase3
        //wordCount(["c", "c", "c", "c"]) → {"c": 4}
        expected.clear();
        expected.put("c", 4);
        assertEquals(expected, m.wordCount(new String[]{"c", "c", "c", "c"}));

    }

    //Given an array of non-empty strings, create and return a Map<String, String> as follows:
    //for each string add its first character as a key with its last character as the value.
    @Test
    void pairs() {
        Map<String, String> expected = new HashMap<>();
        //testcase1
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        map.clear();
        expected.clear();
        expected.put("b", "g");
        expected.put("c", "e");
        assertEquals(expected, m.pairs(new String[]{"code", "bug"}));

        //testcase2
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        expected.clear();
        expected.put("m", "n");
        assertEquals(expected, m.pairs(new String[]{"man", "moon", "main"}));

        //testcase3
        // pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        expected.clear();
        expected.put("g", "d");
        expected.put("m", "n");
        expected.put("n", "t");
        assertEquals(expected, m.pairs(new String[]{"man", "moon", "good", "night"}));
    }

    //Given an array of strings, return a Map<String, Integer> containing a key
    //for every different string in the array, and the value is that string's length.
    @Test
    void wordLen() {
        //testcase1
        //wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        expected.clear();
        expected.put("bb", 2);
        expected.put("a", 1);
        assertEquals(expected, m.wordLen(new String[]{"a", "bb", "a", "bb"}));

        //testcase2
        //wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        expected.clear();
        expected.put("that", 4);
        expected.put("and", 3);
        expected.put("this", 4);
        assertEquals(expected, m.wordLen(new String[]{"this", "and", "that", "and"}));

        //testcase3
        //wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
        expected.clear();
        expected.put("code", 4);
        expected.put("bug", 3);
        assertEquals(expected, m.wordLen(new String[]{"code", "code", "code", "bug"}));
    }

    //Given an array of strings, return a Map<String, Integer> containing a key for every
    //different string in the array, always with the value 0. For example the string "hello" makes
    //the pair "hello":0. We'll do more complicated counting later, but for this problem the value
    //is simply 0.
    @Test
    void word0() {
        //testcase1
        expected.clear();
        expected.put("a", 0);
        expected.put("b", 0);
        assertEquals(expected, m.word0(new String[]{"a", "b", "a", "b"}));

        //testcase2
        expected.clear();
        expected.put("a", 0);
        expected.put("b", 0);
        expected.put("c", 0);
        assertEquals(expected, m.word0(new String[]{"a", "b", "a", "c", "b"}));

        //testcase3
        expected.clear();
        expected.put("a", 0);
        expected.put("b", 0);
        expected.put("c", 0);
        assertEquals(expected, m.word0(new String[]{"c", "b", "a"}));
    }

}