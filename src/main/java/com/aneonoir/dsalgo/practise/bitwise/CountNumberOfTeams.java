package com.aneonoir.dsalgo.practise.bitwise;

/**
 *
 * link: https://leetcode.com/problems/count-number-of-teams/
 *
 * todo: to do in bitwise , hopefully it improves the performance.
 *
 * I initially , got it wrong , understanding, this shows you must spend time in understanding the question if you are seeing it for the fisrsttime.
 * Then I designed the solution which goes up to O(n3) , which is bad.
 *
 * the hint says a brute force way , so I doubt it and TLE is evident .
 *
 * Turns out it did not , Runtime: 16 ms, faster than 54.74% of Java online submissions for Count Number of Teams But  I am pretty sure it will be useful to do some optimization.
 *
 * tag: interview,bitwise,bruteforce.
 *
 */
public class CountNumberOfTeams {
    public int numTeams(int[] rating) {
        int counter = 0;
        for (int i = 0; i <= rating.length - 3; i++) {
            for (int j = i + 1; j < rating.length - 1; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        counter++;
                    }
                    if (rating[i] > rating[j] && rating[j] > rating[k]) counter++;
                }
            }

        }
        return counter;
    }
}
