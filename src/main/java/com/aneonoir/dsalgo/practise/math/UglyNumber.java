package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/ugly-number/submissions/
 * <p>
 * <p>
 * todo: practise. test cases tricky .
 * <p>
 * tag: math, interview. s
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        boolean result = true;
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
