package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/submissions/
 *
 * approach: iterate all the bits and count the cases
 *
 *
 * tag: bitwise,interivew,struggle,
 *
 * Related: https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
 * https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/
 */
public class MinimumFlipsToMakeAAndBToC {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int cV = c >> i & 1;
            int aV = a >> i & 1;
            int bV = b >> i & 1;
            if (cV == 1) {
                if (aV == 0 && bV == 0) {
                    count++;
                }
            } else {
                if (aV == 0 ^ bV == 0) {
                    count++;
                }
                if (aV == 1 && bV == 1) {
                    count = count + 2;
                }
            }
        }
        return count;
    }
}
