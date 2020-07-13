package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/merge-sorted-array/
 * <p>
 * appraoch: bruteforce, copy the data over to first array, and sort the first array.
 * <p>
 * Follow up: It can be done in O(m+n) which will be much faster
 * <p>
 * tag: sorteing, easy , merge sort.
 */
public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
}
