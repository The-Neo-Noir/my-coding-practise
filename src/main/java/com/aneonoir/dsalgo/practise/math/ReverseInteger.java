package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/reverse-integer/submissions/
 * <p>
 * <p>
 * appraoch: Used String to find the length and used in Math.pow to find the reverse, can you do it without it.
 * <p>
 * struggle: watchout for overflows.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int multiplier = 1;
        if (x < 0) {
            multiplier = -1;
        }
        long finalNum = 0;
        int exp = new String((x * multiplier) + "").length() - 1;
        x = x * multiplier;
        boolean flag = true;
        while (x > 0) {
            finalNum = finalNum + (long) Math.pow(10, exp) * (x % 10);
            x = x / 10;
            exp--;
        }
        if (finalNum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) finalNum * multiplier;
    }
}