package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/power-of-two/
 *       https://practice.geeksforgeeks.org/problems/power-of-2/0
 * <p>
 * <p>
 * struggle: numbers negative or 0 should be checked.
 *
 * Note: 0 is not power of 2 , REMEMBEr and (n & (n-1)) is not applied for 0 , so better do a return if input is 0
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        else return (n & (n - 1)) == 0;
    }
}
