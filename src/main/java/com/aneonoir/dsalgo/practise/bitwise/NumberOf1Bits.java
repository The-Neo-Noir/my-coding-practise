package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://leetcode.com/problems/number-of-1-bits/
 * <p>
 * approach: right shift and & operator.
 * <p>
 * tags: right shift , bitwise, & operator , interview
 * <p>
 * learnings: if ((n & 1) == 1) { is correct but if(n&1==1) is compilation error
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        int i = 32;
        while (i-- > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
