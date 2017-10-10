package com.gnevashev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Array2Test {
    Array2 a = new Array2();

    //Return an array that contains the exact same numbers as the given array, but rearranged
    //so that all the zeros are grouped at the start of the array. The order of the non-zero
    //numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and
    //return the given array or make a new array.
    @Test
    void zeroFront() {
        assertArrayEquals(new int[]{0, 0, 1, 1}, a.zeroFront(new int[]{1, 0, 0, 1}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, a.zeroFront(new int[]{0, 1, 1, 0, 1}));
        assertArrayEquals(new int[]{0, 1}, a.zeroFront(new int[]{1, 0}));
    }

    //We'll say that an element in an array is "alone" if there are values before and after it,
    //and those values are different from it. Return a version of the given array where every instance
    //of the given value which is alone is replaced by whichever value to its left or right is larger.
    @Test
    void notAlone() {
        assertArrayEquals(new int[]{1, 3, 3}, a.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, a.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, a.notAlone(new int[]{3, 4}, 3));
        assertArrayEquals(new int[]{1, 1, 1, 2}, a.notAlone(new int[]{1, 1, 1, 2}, 1));
    }

    //Given a non-empty array of ints, return a new array containing the elements from the
    //original array that come after the last 4 in the original array. The original array will
    //contain at least one 4. Note that it is valid in java to create an array of length 0.
    @Test
    void post4() {
        assertArrayEquals(new int[]{1, 2}, a.post4(new int[]{2, 4, 1, 2}));
        assertArrayEquals(new int[]{2}, a.post4(new int[]{4, 1, 4, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, a.post4(new int[]{4, 4, 1, 2, 3}));
    }

    //Given a non-empty array of ints, return a new array containing the elements from the
    //original array that come before the first 4 in the original array. The original array will
    //contain at least one 4. Note that it is valid in java to create an array of length 0.
    @Test
    void pre4() {
        assertArrayEquals(new int[]{1, 2}, a.pre4(new int[]{1, 2, 4, 1}));
        assertArrayEquals(new int[]{3, 1}, a.pre4(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{1}, a.pre4(new int[]{1, 4, 4}));
    }

    //For each multiple of 10 in the given array, change all the values following it to be that
    //multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields
    //{2, 10, 10, 10, 20, 20}.
    @Test
    void tenRun() {
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, a.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        assertArrayEquals(new int[]{10, 10, 20, 20}, a.tenRun(new int[]{10, 1, 20, 2}));
        assertArrayEquals(new int[]{10, 10, 10, 20}, a.tenRun(new int[]{10, 1, 9, 20}));
        assertArrayEquals(new int[]{0, 0}, a.tenRun(new int[]{0, 2}));
    }

    //Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You
    //may modify and return the given array, or return a new array.
    @Test
    void shiftLeft() {
        assertArrayEquals(new int[]{2, 5, 3, 6}, a.shiftLeft(new int[]{6, 2, 5, 3}));
        assertArrayEquals(new int[]{2, 1}, a.shiftLeft(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, a.shiftLeft(new int[]{1}));
    }

    //Given start and end numbers, return a new array containing the sequence of integers
    //from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The
    //end number will be greater or equal to the start number. Note that a length-0 array is
    //valid. (See also: FizzBuzz Code)
    @Test
    void fizzArray3() {
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, a.fizzArray3(5, 10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, a.fizzArray3(11, 18));
        assertArrayEquals(new int[]{1, 2}, a.fizzArray3(1, 3));
    }

    //Return true if the array contains, somewhere, three increasing adjacent numbers like ....
    //4, 5, 6, ... or 23, 24, 25.
    @Test
    void tripleUp() {
        assertTrue(a.tripleUp(new int[]{1, 4, 5, 6, 2}));
        assertTrue(a.tripleUp(new int[]{1, 2, 3}));
        assertFalse(a.tripleUp(new int[]{1, 2, 4}));
    }

    //Return true if the group of N numbers at the start and end of the array are the same. For
    //example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false
    //for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
    @Test
    void sameEnds() {
        assertFalse(a.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        assertFalse(a.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
        assertTrue(a.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
    }

    //Given an array of ints, return true if every 2 that appears in the array is next to another 2.
    @Test
    void twoTwo() {
        assertTrue(a.twoTwo(new int[]{4, 2, 2, 3}));
        assertTrue(a.twoTwo(new int[]{2, 2, 4}));
        assertFalse(a.twoTwo(new int[]{2, 2, 4, 2}));
    }

    //Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and
    //no 3's are next to each other.
    @Test
    void haveThree() {
        assertTrue(a.haveThree(new int[]{3, 1, 3, 1, 3}));
        assertFalse(a.haveThree(new int[]{3, 1, 3, 3}));
        assertFalse(a.haveThree(new int[]{3, 4, 3, 3, 4}));
    }

    //Given an array of ints, return true if the array contains either 3 even or 3 odd values
    //all next to each other.
    @Test
    void modThree() {
        assertTrue(a.modThree(new int[]{2, 1, 3, 5}));
        assertFalse(a.modThree(new int[]{2, 1, 2, 5}));
        assertFalse(a.modThree(new int[]{}));
        assertFalse(a.modThree(new int[]{1}));
        assertFalse(a.modThree(new int[]{1, 3}));
        assertTrue(a.modThree(new int[]{2, 4, 2, 5}));
    }

    //Given an array of ints, return true if there is a 1 in the array with a 2
    //somewhere later in the array.
    @Test
    void has12() {
        assertTrue(a.has12(new int[]{1, 3, 2}));
        assertTrue(a.has12(new int[]{3, 1, 2}));
        assertTrue(a.has12(new int[]{3, 1, 4, 5, 2}));
        assertFalse(a.has12(new int[]{3, 1, 4, 5, 6}));
        assertFalse(a.has12(new int[]{}));
        assertFalse(a.has12(new int[]{1}));
    }

    //Given an array of ints, return true if the array contains two 7's next to each other,
    //or there are two 7's separated by one element, such as with {7, 1, 7}.
    @Test
    void has77() {
        assertTrue(a.has77(new int[]{1, 7, 7}));
        assertTrue(a.has77(new int[]{1, 7, 1, 7}));
        assertFalse(a.has77(new int[]{1, 7, 1, 1, 7}));
    }

    //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider
    //the corresponding element in nums2 (at the same index). Return the count of the number
    //of times that the two elements differ by 2 or less, but are not equal.
    @Test
    void matchUp() {
        assertEquals(2, a.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, a.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, a.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    @Test
    void either24() {
        assertTrue(a.either24(new int[]{1, 2, 2}));
        assertTrue(a.either24(new int[]{4, 4, 1}));
        assertFalse(a.either24(new int[]{4, 4, 1, 2, 2}));
    }

    //We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in
    //the array, at least one of the pair is that value. Return true if the given value is everywhere
    //in the array.
    @Test
    void isEverywhere() {
        assertTrue(a.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertTrue(a.isEverywhere(new int[]{3},1));
        assertFalse(a.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(a.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        assertFalse(a.isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2));
    }

    //Given an array of ints, return true if it contains no 1's or it contains no 4's.
    @Test
    void no14() {
        assertTrue(a.no14(new int[]{1, 2, 3}));
        assertFalse(a.no14(new int[]{1, 2, 3, 4}));
        assertTrue(a.no14(new int[]{2, 3, 4}));
    }

    //Given a number n, create and return a new string array of length n, containing the strings
    //"0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
    //Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new
    //string array is: new String[desired_length]  (See also: FizzBuzz Code)
    @Test
    void fizzArray2() {
        assertArrayEquals(new String[] {"0", "1", "2", "3"}, a.fizzArray2(4));
        assertArrayEquals(new String[] {}, a.fizzArray2(0));
        assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, a.fizzArray2(10));
    }

    //Given an array of ints, return true if every element is a 1 or a 4.
    @Test
    void only14() {
        assertTrue(a.only14(new int[]{1, 4, 1, 4}));
        assertTrue(a.only14(new int[]{1, 1}));
        assertFalse(a.only14(new int[]{1, 4, 2, 4}));
    }

    //Given a number n, create and return a new int array of length n, containing the numbers
    //0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do
    //not need a separate if-statement for the length-0 case; the for-loop should naturally
    //execute 0 times in that case, so it just works. The syntax to make a new int array is:
    //new int[desired_length]   (See also: FizzBuzz Code)
    @Test
    void fizzArray() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, a.fizzArray(4));
        assertArrayEquals(new int[]{0}, a.fizzArray(1));
        assertArrayEquals(new int[]{}, a.fizzArray(0));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, a.fizzArray(10));

    }

    //Given an array of ints, return true if the number of 1's is greater than the number of 4's
    @Test
    void more14() {
        assertTrue(a.more14(new int[]{1, 4, 1}));
        assertFalse(a.more14(new int[]{1, 4, 1, 4}));
        assertTrue(a.more14(new int[]{1, 1}));
    }

    //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    @Test
    void sum28() {
        assertTrue(a.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertFalse(a.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertFalse(a.sum28(new int[]{1, 2, 3, 4}));
    }

    //Given an array of ints, return true if the array contains no 1's and no 3's.
    @Test
    void lucky13() {
        assertTrue(a.lucky13(new int[]{0, 2, 4}));
        assertFalse(a.lucky13(new int[]{1, 2, 3}));
        assertFalse(a.lucky13(new int[]{1, 2, 4}));
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    @Test
    void has22() {
        assertTrue(a.has22(new int[]{1, 2, 2}));
        assertFalse(a.has22(new int[]{1, 2, 1, 2}));
        assertFalse(a.has22(new int[]{2, 1, 2}));
    }

    //Return the sum of the numbers in the array, except ignore sections of numbers starting
    //with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    //Return 0 for no numbers.
    @Test
    void sum67() {
        assertEquals(5, a.sum67(new int[]{1, 2, 2}));
        assertEquals(5, a.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        assertEquals(4, a.sum67(new int[]{1, 1, 6, 7, 2}));
    }

    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the
    //number 13 is very unlucky, so it does not count and numbers that come immediately after
    //a 13 also do not count.
    @Test
    void sum13() {
        assertEquals(6, a.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, a.sum13(new int[]{1, 1}));
        assertEquals(6, a.sum13(new int[]{1, 2, 2, 1, 13}));
    }

    //Return the "centered" average of an array of ints, which we'll say is the mean average of
    //the values, except ignoring the largest and smallest values in the array. If there are
    //multiple copies of the smallest value, ignore just one copy, and likewise for the largest
    //value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    @Test
    void centeredAverage() {
        assertEquals(3, a.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        assertEquals(5, a.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        assertEquals(-3, a.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }

    //Given an array length 1 or more of ints, return the difference between the largest and
    //smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
    //methods return the smaller or larger of two values.
    @Test
    void bigDiff() {
        assertEquals(7, a.bigDiff(new int[]{10, 3, 5, 6}));
        assertEquals(8, a.bigDiff(new int[]{7, 2, 10, 9}));
        assertEquals(8, a.bigDiff(new int[]{2, 10, 7, 2}));
    }

    //Return the number of even ints in the given array.
    //Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    @Test
    void countEvens() {
        assertEquals(3, a.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, a.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, a.countEvens(new int[]{1, 3, 5}));
    }

}