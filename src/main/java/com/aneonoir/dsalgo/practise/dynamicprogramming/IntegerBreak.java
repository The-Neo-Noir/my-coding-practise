package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
     * link: https://leetcode.com/problems/integer-break/
 * <p>
 * tag: medium , dynamic programming , math,
 * <p>
 * TODO: can you do a top down approach ?
 * Runtime: 1 ms, faster than 53.32% of Java online submissions for Integer Break.
 * See how others are doing it
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        if (n == 2) return dp[n];
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            int max = i - 1;
            for (int j = 2; j <= i / 2; j++) {
                int cmax = Math.max(j * dp[i - j], (j * (i - j)));
                if (cmax > max) {
                    max = cmax;
                }
            }
            dp[i] = max;
        }
        return dp[n];
    }

}
