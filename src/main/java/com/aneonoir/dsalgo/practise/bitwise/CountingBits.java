package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link:https://leetcode.com/problems/counting-bits/
 * <p>
 * approach: ounting bits is an interesting problem, the bruteforce will take O(n*sizeOf(bits)),
 * however using the first hint I could come up with a solution. which solve it in o(n)
 * Struggle at casesses like for 0
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] a = new int[num + 1];
        if (num >= 0) {
            a[0] = 0;
        }
        if (num >= 1) {
            a[1] = 1;
        }
        for (int i = 2; i <= num; i++) {
            a[i] = a[i / 2] + a[i % 2];
        }
        return a;
    }
}