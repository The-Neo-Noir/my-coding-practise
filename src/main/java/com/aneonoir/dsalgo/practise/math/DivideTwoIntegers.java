package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/divide-two-integers/
 * <p>
 * apporach: division is repeatative substration, but there are a lot of corner cases revolves around
 * the overflow case, could not complete it , TODO: NOT EASY AS IT LOOKS.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int resultingNegative = dividend < 0 ^ divisor < 0 ? -1 : 1;
        if (dividend == Integer.MIN_VALUE) {
            dividend = Integer.MAX_VALUE;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int count = 0;
        while (divisor <= dividend) {
            dividend = dividend - divisor;
            count++;
        }
        return count * resultingNegative;
    }
}