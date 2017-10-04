package com.gnevashev;

public class Array2 {

    //Return the number of even ints in the given array.
    //Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Given an array length 1 or more of ints, return the difference between the largest and
    //smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
    //methods return the smaller or larger of two values.
    public int bigDiff(int[] nums) {
        int maxValue = nums[0];
        int minValue = maxValue;
        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        return maxValue - minValue;
    }

    //Return the "centered" average of an array of ints, which we'll say is the mean average of
    //the values, except ignoring the largest and smallest values in the array. If there are
    //multiple copies of the smallest value, ignore just one copy, and likewise for the largest
    //value. Use int division to produce the final average. You may assume that the array is length 3 or more.
    public int centeredAverage(int[] nums) {
        int maxValue = nums[0];
        int minValue = maxValue;
        int total = 0;
        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
            total += num;
        }
        return (total - maxValue - minValue) / (nums.length - 2);
    }

    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the
    //number 13 is very unlucky, so it does not count and numbers that come immediately after
    //a 13 also do not count.
    public int sum13(int[] nums) {
        int total = 0;
        boolean missNext = false;
        for (int num : nums) {
            if (num == 13) {
                missNext = true;
                continue;
            }
            if (missNext) {
                missNext = false;
                continue;
            }
            total += num;
        }
        return total;
    }

    //Return the sum of the numbers in the array, except ignore sections of numbers starting
    //with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    //Return 0 for no numbers.
    public int sum67(int[] nums) {
        int total = 0;
        boolean missNext = false;
        for (int num : nums) {
            if (num == 6) {
                missNext = true;
                continue;
            }
            if (missNext) {
                if (num == 7) missNext = false;
                continue;
            }
            total += num;
        }
        return total;
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public boolean has22(int[] nums) {
        if (nums.length < 2) return false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) return true;
        }
        return false;
    }

    //Given an array of ints, return true if the array contains no 1's and no 3's.
    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) return false;
        }
        return true;
    }

}
