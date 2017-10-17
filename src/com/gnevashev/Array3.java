package com.gnevashev;

public class Array3 {

    //Consider the leftmost and righmost appearances of some value in an array. We'll say that
    //the "span" is the number of elements between the two inclusive. A single value has a span
    //of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    maxSpan = Integer.max(maxSpan, j - i + 1);
                }
            }
        }
        return maxSpan;
    }

    //Return an array that contains exactly the same numbers as the given array, but rearranged
    //so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move.
    //The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
    //and a 3 appears in the array before any 4.
    public int[] fix34(int[] nums) {
        for (int i = 0, startJ = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = startJ; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                        startJ = j+1;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    //(This is a slightly harder version of the fix34 problem.) Return an array that contains
    //exactly the same numbers as the given array, but rearranged so that every 4 is immediately
    //followed by a 5. Do not move the 4's, but every other number may move. The array contains
    //the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
    //In this version, 5's may appear anywhere in the original array.
    public int[] fix45(int[] nums) {
        for (int i = 0, startJ = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i+1] != 5) {
                for (int j = startJ; j < nums.length; j++) {
                    if (nums[j] == 5 && (j ==0 || nums[j - 1] != 4)) {
                        nums[j] = nums[i+1];
                        nums[i+1] = 5;
                        startJ = j+1;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    //Given a non-empty array, return true if there is a place to split the array so that the sum
    //of the numbers on one side is equal to the sum of the numbers on the other side.
    public boolean canBalance(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        if (totalSum % 2 != 0) return false;

        for (int i = 0; i < nums.length-1; i++) {
            leftSum += nums[i];
            rightSum = totalSum - leftSum;
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    //Given two arrays of ints sorted in increasing order, outer and inner, return true if all of
    //the numbers in inner appear in outer. The best solution makes only a single "linear" pass of
    //both arrays, taking advantage of the fact that both arrays are already in sorted order.
    public boolean linearIn(int[] outer, int[] inner) {
        boolean indicator = false;
        for (int i = 0, startJ = 0; i < inner.length; i++) {
            indicator = false;
            for (int j = startJ; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    indicator = true;
                    startJ = j + 1;
                    break;
                }
            }
            if (!indicator) return false;
        }
        return true;
    }

    //Given n>=0, create an array length n*n with the following pattern, shown here for n=3 :
    //{0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
    public int[] squareUp(int n) {
        int[] nums = new int[n*n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (i+1); j++) {
                nums[(i+1)*n - j] = j;
            }
        }
        return nums;
    }

    //Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
    //(spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3
    //... + n, which is known to sum to exactly n*(n + 1)/2.
    public int[] seriesUp(int n) {
        int len = n*(n+1) / 2;
        int pos = 0;
        int[] nums = new int[len];
        for (int i = 0; i < n; i++) {
            pos += i;
            for (int j = 1; j <= i+1; j++) {
                nums[pos + j - 1] = j;
            }
        }
        return nums;
    }

    //We'll say that a "mirror" section in an array is a group of contiguous elements such that
    //somewhere in the array, the same group appears in reverse order. For example, the largest
    //mirror section in {1, 2, 3, 8, 3, 2, 1, 9} is length 3 (the {1, 2, 3} part). Return the size of
    //the largest mirror section found in the given array.
    public int maxMirror(int[] nums) {
        int maxMirror = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1, k = i, count = 0; j >= 0 && k < nums.length; j--) {
                if (nums[k] == nums[j]) {
                    count++;
                    k++;
                    maxMirror = Integer.max(maxMirror, count);
                }
                else {
                    k = i;
                    count = 0;
                }
            }
        }
        return maxMirror;
    }

    //Say that a "clump" in an array is a series of 2 or more adjacent elements of the same
    //value. Return the number of clumps in the given array.
    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            if (j - i > 1) {
                count++;
            }
            i = j;
        }
        return count;
    }


}
