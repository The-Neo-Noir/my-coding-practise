package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/arranging-coins/
 * <p>
 * TODO: must be an interview question, could be solved in using binary search ,
 * <p>
 * tag: binary search, interview, greedy, math.  coin arrangement
 */
public class ArrangingCoin {
    public int arrangeCoins(int n) {
        int result = 0;
        int level = 1;
        while (n - level >= 0) {
            n = n - level;
            level++;
            result++;
        }
        return result;
    }
}

