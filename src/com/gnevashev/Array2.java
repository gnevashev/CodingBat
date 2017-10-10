package com.gnevashev;

import java.util.ArrayList;
import java.util.Arrays;

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

    //We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in
    //the array, at least one of the pair is that value. Return true if the given value is everywhere
    //in the array.
    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != val && nums[i+1] != val) return false;
        }
        return true;
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    public boolean either24(int[] nums) {
        boolean is2 = false;
        boolean is4 = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (!is2 && nums[i] == 2 && nums[i+1] == 2) is2 = true;
            if (!is4 && nums[i] == 4 && nums[i+1] == 4) is4 = true;
            if (is2 && is4) break;
        }
        return (is2 ^ is4);
    }

    //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider
    //the corresponding element in nums2 (at the same index). Return the count of the number
    //of times that the two elements differ by 2 or less, but are not equal.
    public int matchUp(int[] nums1, int[] nums2) {
        int diff = 0;
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            diff = Math.abs(nums1[i] - nums2[i]);
            if (diff == 1 || diff == 2) {
                count++;
            }
        }
        return count;
    }

    //Given an array of ints, return true if the array contains two 7's next to each other,
    //or there are two 7's separated by one element, such as with {7, 1, 7}.
    public boolean has77(int[] nums) {
        int first7 = -1;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 7 && first7 == -1) {
               first7 = i;
               continue;
           }
           if (nums[i] == 7) {
               if (i - first7 == 1 || i- first7 == 2) return true;
               first7 = i;
               continue;
           }
        }
        return false;
    }

    //Given an array of ints, return true if there is a 1 in the array with a 2
    //somewhere later in the array.
    public boolean has12(int[] nums) {
        boolean has1 = false;
        boolean has2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (!has1 && nums[i] == 1) has1 = true;
            if (has1 && !has2 && nums[i] == 2) has2 = true;
            if (has1 && has2) break;
        }
        return (has1 && has2);
    }

    //Given an array of ints, return true if the array contains either 3 even or 3 odd values
    //all next to each other.
    public boolean modThree(int[] nums) {
        if (nums.length < 3) return false;
        int mod = 0;
        for (int i = 0; i < nums.length-2; i++) {
            mod = nums[i] % 2;
            if (nums[i+1] % 2 == mod && nums[i+2] % 2 == mod) return true;
        }
        return false;
    }

    //Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and
    //no 3's are next to each other.
    public boolean haveThree(int[] nums) {
        if (nums.length < 5) return false;
        int count = 0;
        int prev3s = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (count == 0) { //first 3
                    count++;
                    prev3s = i;
                }
                else { //second and next 3-s
                    count++;
                    if (prev3s + 1 == i) return false; //check if prev 3 is next to current 3
                    prev3s = i;
                }
            }
        }
        return (count == 3);
    }

    //Given an array of ints, return true if every 2 that appears in the array is next to another 2.
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (!((i > 0 && nums[i-1] == 2) || (i < nums.length - 1 && nums[i+1] == 2)))
                        return false;
            }
        }
        return true;
    }

    //Return true if the group of N numbers at the start and end of the array are the same. For
    //example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false
    //for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
         if (nums[i] != nums[nums.length-len+i]) return false;
        }
        return true;
    }

    //Return true if the array contains, somewhere, three increasing adjacent numbers like ....
    //4, 5, 6, ... or 23, 24, 25.
    public boolean tripleUp(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] + 1 == nums[i+1] && nums[i] + 2 == nums[i+2]) return true;
        }
        return false;
    }

    //Given start and end numbers, return a new array containing the sequence of integers
    //from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The
    //end number will be greater or equal to the start number. Note that a length-0 array is
    //valid. (See also: FizzBuzz Code)
    public int[] fizzArray3(int start, int end) {
        int[] nums = new int[end - start];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + i;
        }
        return nums;
    }

    //Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You
    //may modify and return the given array, or return a new array.
    public int[] shiftLeft(int[] nums) {
        if (nums.length < 2) return nums;
        int firstNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = firstNum;
        return nums;
    }

    //For each multiple of 10 in the given array, change all the values following it to be that
    //multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields
    //{2, 10, 10, 10, 20, 20}.
    public int[] tenRun(int[] nums) {
        int mof10 = 0;
        boolean mofActivated = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                mof10 = nums[i];
                mofActivated = true;
                continue;
            }
            if (mofActivated){
                nums[i] = mof10;
            }
        }
        return nums;
    }

    //Given a non-empty array of ints, return a new array containing the elements from the
    //original array that come before the first 4 in the original array. The original array will
    //contain at least one 4. Note that it is valid in java to create an array of length 0.
    public int[] pre4(int[] nums) {
        int posOf4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                posOf4 = i;
                break;
            }
        }
        int[] ret = new int[posOf4];
        for (int i = 0; i < posOf4; i++) {
            ret[i] = nums[i];
        }
        return ret;
    }

    //Given a non-empty array of ints, return a new array containing the elements from the
    //original array that come after the last 4 in the original array. The original array will
    //contain at least one 4. Note that it is valid in java to create an array of length 0.
    public int[] post4(int[] nums) {
        int posOf4 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                posOf4 = i;
                break;
            }
        }
        int[] ret = new int[nums.length - posOf4 - 1];
        for (int i = posOf4+1; i < nums.length; i++) {
            ret[i - posOf4 - 1] = nums[i];
        }
        return ret;
    }

    //We'll say that an element in an array is "alone" if there are values before and after it,
    //and those values are different from it. Return a version of the given array where every instance
    //of the given value which is alone is replaced by whichever value to its left or right is larger.
    public int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) return nums;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] == val && nums[i] != nums[i+1] && nums[i] != nums[i-1]) {
                nums[i] = Math.max(nums[i-1], nums[i+1]);
            }
        }
        return nums;
    }

    //Return an array that contains the exact same numbers as the given array, but rearranged
    //so that all the zeros are grouped at the start of the array. The order of the non-zero
    //numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and
    //return the given array or make a new array.
    public int[] zeroFront(int[] nums) {
        int lastZeroPos = 0;
        int tempValue = 0;
        for (int i = 0; i < nums.length; i++) {
            //skip zero's in the beginning of the array
            if (i == lastZeroPos && nums[i] == 0) {
                lastZeroPos++;
                continue;
            }
            //core logic, swap 0 and the number
            if (nums[i] == 0) {
                tempValue = nums[lastZeroPos];
                nums[lastZeroPos] = 0;
                nums[i] = tempValue;
                lastZeroPos++;
            }
        }
        return nums;
    }
}
