package com.gnevashev;

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
            if (scores[i] <= scores[i+1] && scores[i+1] <= scores[i+2] && scores[i+2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

}
