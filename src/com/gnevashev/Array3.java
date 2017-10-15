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


}
