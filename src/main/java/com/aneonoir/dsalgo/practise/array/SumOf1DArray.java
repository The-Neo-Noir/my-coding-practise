package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/running-sum-of-1d-array/
 *
 */
public class SumOf1DArray {
    public int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}