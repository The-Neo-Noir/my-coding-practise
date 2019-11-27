package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/valid-perfect-square/
 * <p>
 * approach: a binary search is good idea.
 * <p>
 * <p>
 * Lessions learnt:
 * > Overflow: if you perform any operation on
 * > binary search algorithm has to be perfect.
 * >
 * Canyou do iteratively?
 * <p>
 * TODO:
 * tags: math, sqrt,interview.
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        return binarySearch(0, num, num);
    }

    public boolean binarySearch(long low, long high, int num) {
        if (low <= high) {
            long num1 = (low + high) / 2;
            if (num1 * num1 == num) {
                return true;
            } else if (num1 * num1 > num) {
                return binarySearch(low, num1 - 1, num);
            } else {
                return binarySearch(num1 + 1, high, num);
            }
        } else {
            return false;
        }
    }
}
