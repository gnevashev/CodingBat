package com.gnevashev;

import java.util.ArrayList;
import java.util.List;

public class Array1 {

    //Given an array of ints, return true if 6 appears as either the first
    //or last element in the array. The array will be length 1 or more.
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length-1] == 6);

    }

    //Given an array of ints, return true if the array is length 1 or more,
    //and the first element and the last element are equal.
    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0 && nums[0] == nums[nums.length-1]);
    }

    //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    //Given 2 arrays of ints, a and b, return true if they have the same first element
    //or they have the same last element. Both arrays will be length 1 or more.
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }

    //Given an array of ints length 3, return the sum of all the elements
    public int sum3(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }


    //Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    public int[] rotateLeft3(int[] nums) {
        int[] retArray = new int[3];
        retArray[0] = nums[1];
        retArray[1] = nums[2];
        retArray[2] = nums[0];
        return retArray;
    }

    //Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
    public int[] reverse3(int[] nums) {
        int[] retNums = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            retNums[j] = nums[i];
            j++;
        }
        return retNums;
    }

    //Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    // If either array is length 0, ignore that array.
    public int[] front11(int[] a, int[] b) {
        int[] retArray;

        if (a.length > 0 && b.length > 0) {
            retArray = new int[2];
            retArray[0] = a[0];
            retArray[1] = b[0];
            return retArray;
        }
        if (a.length > 0 || b.length > 0) {
            retArray = new int[1];
            if (a.length > 0) {
                retArray[0] = a[0];
                return retArray;
            }
            if (b.length > 0 ) {
                retArray[0] = b[0];
                return retArray;
            }
        }
        retArray = new int [0];
        return retArray;
    }

    //Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    //and set all the other elements to be that value. Return the changed array.
    public int[] maxEnd3(int[] nums) {
        int maxValue = Math.max(nums[0], nums[nums.length-1]);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = maxValue;
        }
        return nums;
    }

    //Given an array of ints, return the sum of the first 2 elements in the array.
    //If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
    public int sum2(int[] nums) {
        int ret = 0;
        for (int i = 0; i < Math.min(2, nums.length); i++) {
            ret += nums[i];
        }
        return ret;
    }

    //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    public int[] middleWay(int[] a, int[] b) {
        int[] c = new int[]{a[1], b[1]};
        return c;
    }

    //Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
    //The original array will be length 1 or more.
    public int[] makeEnds(int[] nums) {
        int[] a = new int[]{nums[0], nums[nums.length-1]};
        return a;
    }

    //Given an int array length 2, return true if it contains a 2 or a 3.
    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }

    //Given an int array, return a new array with double the length where its last element is the same as the original array,
    //and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
    public int[] makeLast(int[] nums) {
        int[] a = new int[nums.length*2];
        a[a.length-1] = nums[nums.length-1];
        return a;
    }

    //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    public boolean double23(int[] nums) {
        return (nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)));
    }

    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    //Return the changed array.
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
            return nums;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
            return nums;
        }
        return nums;
    }

}
