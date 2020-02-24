package com.aneonoir.dsalgo.practise.sorting;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 *
 * approach: a regular multikey sorting mechanism
 *
 * Struggle: understand the string sorting properly.
 *
 * runtime: Runtime: 11 ms, faster than 38.12% of Java online submissions for Sort Integers by The Number of 1 Bits.
 *
 * tag: sort, multikey sort, easy, string,comparator, string sorting.
 */
public class SortIntegersbyTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        Wrap objs[] = new Wrap[arr.length];
        for (int i = 0; i < arr.length; i++) {
            objs[i] = new Wrap(arr[i], calculateOnes(arr[i]), Integer.toBinaryString(arr[i]));
        }
        Arrays.sort(objs);
        int i = 0;
        for (Wrap obj : objs) {
            arr[i++] = obj.val;
        }
        return arr;

    }

    public int calculateOnes(int num) {
        String str = Integer.toBinaryString(num);
        int count = 0;
        for (Character ch : str.toCharArray()) {
            if (ch == '1') count++;
        }
        return count;
    }

    class Wrap implements Comparable<Wrap> {
        int ones;
        String binary;
        int val;

        Wrap(int val, int ones, String binary) {
            this.val = val;
            this.ones = ones;
            this.binary = binary;
        }

        public int compareTo(Wrap ob) {
            if (this.ones == ob.ones) {
                if (this.binary.length() == ob.binary.length()) {
                    return this.binary.compareTo(ob.binary);
                } else {
                    return this.binary.length() - ob.binary.length();
                }

            } else {
                return this.ones - ob.ones;
            }
        }
    }
}
