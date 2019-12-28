package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/count-numbers-with-unique-digits/
 * <p>
 * approach:  think permutation and combination, It took a while for me to come up with the solution,
 * <p>
 * tags: math, permutation,combination, dynamic programming, interview
 * <p>
 * TODO: can you do it recursively. ?
 */
public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        int ns[] = new int[n + 1];
        if (n == 0) return 1;
        if (n == 1) return 10;
        if (n == 2) return 81 + 10;
        ns[0] = 0;
        ns[1] = 10;
        ns[2] = 81;
        int sum = ns[1] + ns[2];
        for (int i = 3; i <= n; i++) {
            ns[i] = ns[i - 1] * (10 - i + 1);
            sum += ns[i];
        }
        return sum;
    }
}
