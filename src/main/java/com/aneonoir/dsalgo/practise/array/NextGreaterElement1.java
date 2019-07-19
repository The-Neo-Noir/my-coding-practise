package com.aneonoir.dsalgo.practise.array;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/next-greater-element-i/
 * <p>
 * approach: solved in o(n^2) can you solve it better : TODO:
 */
public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int startIndex = map.get(nums1[i]);
            int numer = nums2[startIndex];
            int resultItem = -1;
            for (int j = startIndex + 1; j < nums2.length; j++) {
                if (nums2[j] > numer) {
                    resultItem = nums2[j];
                    break;
                }
            }
            result[i] = resultItem;
        }
        return result;
    }
}