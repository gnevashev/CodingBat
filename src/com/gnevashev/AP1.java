package com.gnevashev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AP1 {

    //Given an array of scores, return true if each score is equal or greater than the one before.
    //The array will be length 2 or more.
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i-1] > scores [i]) return false;
        }
        return true;
    }

    //Given an array of scores, return true if there are scores of 100 next to each other in the
    //array. The array length will be at least 2.
    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i-1] == 100 && scores [i] == 100) return true;
        }
        return false;
    }

    //Given an array of scores sorted in increasing order, return true if the array
    //contains 3 adjacent scores that differ from each other by at most 2,
    //such as with {3, 4, 5} or {3, 5, 5}.
    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) return false;
        for (int i = 0; i < scores.length-2; i++) {
            if (scores[i+2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    //Given an array of scores, compute the int average of the first half and the second half, and
    //return whichever is larger. We'll say that the second half begins at index length/2. The
    //array length will be at least 2. To practice decomposition, write a separate helper method
    //int average(int[] scores, int start, int end) { which computes the average of the
    //elements between indexes start..end. Call your helper method twice to implement scoresAverage().
    //Write your helper method after your scoresAverage() method in the JavaBat text area.
    //Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
    public int scoresAverage(int[] scores) {
        return Integer.max(average(scores, 0, scores.length/2), average(scores, scores.length/2, scores.length));
    }

    int average(int[] scores, int start, int end){
        int avg = 0;
        for (int i = start; i < scores.length && i < end; i++) {
            avg += scores[i];
        }
        avg = avg / (end - start);
        return avg;
    }

    //Given an array of strings, return the count of the number of strings with the given length.
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

    //Given an array of strings, return a new array containing the first N strings.
    //N will be in the range 1..length.
    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOfRange(words, 0, n);
    }

    //Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the
    //given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
    public List wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<String>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }
        }
        return result;
    }

    //Given a positive int n, return true if it contains a 1 digit.
    //Note: use % to get the rightmost digit, and / to discard the rightmost digit.
    public boolean hasOne(int n) {
        return Integer.toString(n).matches("(.*)1(.*)");
    }

    //We'll say that a positive int divides itself if every digit in the number divides into the
    //number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
    //We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
    //Note: use % to get the rightmost digit, and / to discard the rightmost digit.
    public boolean dividesSelf(int n) {
        int k = n;
        int mod = 0;
        while (k > 0) {
            mod = k % 10;
            if (mod == 0 || n % mod != 0) return false;
            k = k / 10;
        }
        return true;
    }
}
