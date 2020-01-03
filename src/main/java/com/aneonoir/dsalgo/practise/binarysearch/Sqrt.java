package com.aneonoir.dsalgo.practise.binarysearch;

/**
 * link: https://leetcode.com/problems/sqrtx/submissions/
 * <p>
 * struggle: major struggle , why I get stuck in binary search all the time.
 * <p>
 * gotcha: low and high when mid is calculated is going to fall outof bounds,
 *
 * tag:  mathematics,maths,math,binary search
 */
public class Sqrt {
    public int mySqrt(int x) {
        return bin(1, x, x);
    }

    public int bin(long low, long high, int x) {
        if (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid > x) {
                high = mid - 1;
                return bin(low, high, x);
            } else if (mid * mid < x) {
                low = mid + 1;
                return bin(low, high, x);
            } else {
                return (int) mid;
            }
        } else {
            return (int) high;
        }
    }
}