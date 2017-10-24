package com.gnevashev;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    private Map1 m = new Map1();

    private HashMap<String, String> map = new HashMap<>();
    private HashMap<String, String> expected = new HashMap<>();

    //Modify and return the given map as follows: if the keys "a" and "b" have values that have
    //different lengths, then set "c" to have the longer value. If the values exist and have the
    //same length, change them both to the empty string in the map.
    @Test
    void mapAB4() {
        //testcase1
        map.clear();
        expected.clear();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        expected.put("a", "aaa");
        expected.put("b", "bb");
        expected.put("c", "aaa");
        assertEquals(expected, m.mapAB4(map));

        //testcase2
        map.clear();
        expected.clear();
        map.put("a", "aa");
        map.put("b", "bbb");
        map.put("c", "cake");
        expected.put("a", "aa");
        expected.put("b", "bbb");
        expected.put("c", "bbb");
        assertEquals(expected, m.mapAB4(map));

        //testcase3
        map.clear();
        expected.clear();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cake");
        expected.put("a", "");
        expected.put("b", "");
        expected.put("c", "cake");
        assertEquals(expected, m.mapAB4(map));

        //testcase4
        map.clear();
        expected.clear();
        map.put("c", "cake");
        expected.put("c", "cake");
        assertEquals(expected, m.mapAB4(map));
    }

    //Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a
    //value in the map (but not both), set the other to have that same value in the map.
    @Test
    void mapAB3() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //testcase1
        map.put("a", "aaa");
        map.put("c", "cake");
        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("c", "cake");
        assertEquals(expected, m.mapAB3(map));

        map.clear();
        expected.clear();

        //testcase2
        map.put("b", "bbb");
        map.put("c", "cake");
        expected.put("a", "bbb");
        expected.put("b", "bbb");
        expected.put("c", "cake");
        assertEquals(expected, m.mapAB3(map));

        map.clear();
        expected.clear();

        //testcase3
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "cake");
        expected.put("a", "aaa");
        expected.put("b", "bbb");
        expected.put("c", "cake");
        assertEquals(expected, m.mapAB3(map));
    }

    //Modify and return the given map as follows: if the keys "a" and "b" are both
    //in the map and have equal values, remove them both.
    @Test
    void mapAB2() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //testcase1
        map.put("a", "aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        expected.put("c", "cake");
        assertEquals(expected, m.mapAB2(map));

        map.clear();
        expected.clear();

        //testcase2
        map.put("a", "aaa");
        map.put("b", "bbb");
        expected.put("a", "aaa");
        expected.put("b", "bbb");
        assertEquals(expected, m.mapAB2(map));

        map.clear();
        expected.clear();

        //testcase3
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "aaa");
        expected.put("a", "aaa");
        expected.put("b", "bbb");
        expected.put("c", "aaa");
        assertEquals(expected, m.mapAB2(map));

        map.clear();
        expected.clear();

        //testcase4
        map.put("b", "bbb");
        expected.put("b", "bbb");
        assertEquals(expected, m.mapAB2(map));
    }

    //Given a map of food keys and topping values, modify and return the map as follows:
    //if the key "potato" has a value, set that as the value for the key "fries".
    //If the key "salad" has a value, set that as the value for the key "spinach".
    @Test
    void topping3() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();


        //testcase1
        map.put("potato", "ketchup");
        expected.put("potato", "ketchup");
        expected.put("fries", "ketchup");
        assertEquals(expected, m.topping3(map));

        map.clear();
        expected.clear();

        //testcase2
        map.put("potato", "butter");
        expected.put("potato", "butter");
        expected.put("fries", "butter");
        assertEquals(expected, m.topping3(map));

        map.clear();
        expected.clear();

        //testcase3
        map.put("salad", "oil");
        map.put("potato", "ketchup");
        expected.put("spinach", "oil");
        expected.put("salad", "oil");
        expected.put("potato", "ketchup");
        expected.put("fries", "ketchup");
        assertEquals(expected, m.topping3(map));
    }

    //Given a map of food keys and their topping values, modify and return the map as follows:
    //if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
    //If the key "spinach" has a value, change that value to "nuts".
    @Test
    void topping2() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //testcase1
        map.put("ice cream", "cherry");
        expected.put("yogurt", "cherry");
        expected.put("ice cream", "cherry");
        assertEquals(expected, m.topping2(map));

        map.clear();
        expected.clear();

        //testcase2
        map.put("spinach", "dirt");
        map.put("ice cream", "cherry");
        expected.put("yogurt", "cherry");
        expected.put("spinach", "nuts");
        expected.put("ice cream", "cherry");
        assertEquals(expected, m.topping2(map));

        map.clear();
        expected.clear();

        //testcase3
        map.put("yogurt", "salt");
        expected.put("yogurt", "salt");
        assertEquals(expected, m.topping2(map));
    }

    //Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream"
    //is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
    @Test
    void topping1() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //testcase1
        map.put("ice cream", "peanuts");
        expected.put("bread", "butter");
        expected.put("ice cream", "cherry");
        assertEquals(expected, m.topping1(map));

        map.clear();
        expected.clear();
        //testcase2
        expected.put("bread", "butter");
        assertEquals(expected, m.topping1(map));

        map.clear();
        expected.clear();

        //testcase3
        map.put("pancake", "syrup");
        expected.put("bread", "butter");
        expected.put("pancake", "syrup");
        assertEquals(expected, m.topping1(map));
    }

    //Modify and return the given map as follows: for this problem the map may or may not contain
    //the "a" and "b" keys. If both keys are present, append their 2 string values together and
    //store the result under the key "ab".
    @Test
    void mapAB() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //testcase 1
        map.put("a", "Hi");
        map.put("b", "There");

        expected.put("a", "Hi");
        expected.put("b", "There");
        expected.put("ab", "HiThere");
        assertEquals(expected, m.mapAB(map));

        map.clear();
        expected.clear();

        //testcase 2
        map.put("a", "Hi");
        expected.put("a", "Hi");
        assertEquals(expected, m.mapAB(map));

        map.clear();
        expected.clear();
        //testcase 3
        map.put("b", "There");
        expected.put("b", "There");
        assertEquals(expected, m.mapAB(map));
    }

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    //have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
    @Test
    void mapShare() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();
        //test case 1
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");

        expected.put("a", "aaa");
        expected.put("b", "aaa");
        assertEquals(expected, m.mapShare(map));

        map.clear();
        expected.clear();
        //test case 2
        map.put("b", "xyz");
        map.put("c", "ccc");

        expected.put("b", "xyz");
        assertEquals(expected, m.mapShare(map));

        map.clear();
        expected.clear();
        //test case 3
        map.put("a", "aaa");
        map.put("c", "meh");
        map.put("d", "hi");

        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("d", "hi");
        assertEquals(expected, m.mapShare(map));
    }

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to
    //have that value, and set the key "a" to have the value "". Basically "b" is a bully,
    //taking the value and replacing it with the empty string.
    @Test
    void mapBully() {
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> expected = new HashMap<>();

        //test case 1
        map.put ("a", "candy");
        map.put ("b", "dirt");
        expected.put("a", "");
        expected.put("b", "candy");
        assertEquals(expected, m.mapBully(map));

        expected.clear();
        map.clear();

        //test case 2
        map.put("a", "candy");
        expected.put ("a", "");
        expected.put ("b", "candy");
        assertEquals(expected, m.mapBully(map));

        expected.clear();
        map.clear();
        //test case 3
        map.put("a", "candy");
        map.put("b", "carrot");
        map.put("c", "meh");
        expected.put("a", "");
        expected.put("b", "candy");
        expected.put("c", "meh");
        assertEquals(expected, m.mapBully(map));
    }

}