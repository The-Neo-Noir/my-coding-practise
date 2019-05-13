package com.aneonoir.dsalgo.practise.math;

/**
 *
 * link: https://leetcode.com/problems/power-of-two/
 *
 *
 * struggle: numbers negative or 0 should be checked.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        else return (n& (n-1) )==0;
    }
}
