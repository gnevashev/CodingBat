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

    //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum28(int[] nums) {
        int total = 0;
        for (int value : nums) {
            if (value == 2) {
                total += value;
            }
        }
        return (total == 8);
    }

    //Given an array of ints, return true if the number of 1's is greater than the number of 4's
    public boolean more14(int[] nums) {
        int count1s = 0;
        int count4s = 0;
        for (int value : nums) {
            if (value == 1) count1s++;
            if (value == 4) count4s++;
        }
        return (count1s > count4s);
    }

    //Given a number n, create and return a new int array of length n, containing the numbers
    //0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do
    //not need a separate if-statement for the length-0 case; the for-loop should naturally
    //execute 0 times in that case, so it just works. The syntax to make a new int array is:
    //new int[desired_length]   (See also: FizzBuzz Code)
    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    //Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums) {
        for (int value : nums) {
            if (value != 1 && value != 4) return false;
        }
        return true;
    }

    //Given a number n, create and return a new string array of length n, containing the strings
    //"0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
    //Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new
    //string array is: new String[desired_length]  (See also: FizzBuzz Code)
    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    //Given an array of ints, return true if it contains no 1's or it contains no 4's.
    public boolean no14(int[] nums) {
        boolean have1s = false;
        boolean have4s = false;
        for (int value : nums) {
            if (value == 1) have1s = true;
            if (value == 4) have4s = true;
            if (have1s && have4s) return false;
        }
        return true;
    }
}
