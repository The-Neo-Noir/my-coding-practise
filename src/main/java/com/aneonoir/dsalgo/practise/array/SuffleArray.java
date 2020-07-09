package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/shuffle-the-array/
 *
 * could have been done better
 *
 */
public class SuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            result[counter++] = nums[i];
            result[counter++] = nums[i + n];
        }
        return result;
    }
}
