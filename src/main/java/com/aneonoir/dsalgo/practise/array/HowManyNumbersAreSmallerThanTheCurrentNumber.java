package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 *
 * TODO: can be done faster,
 *
 * tag: array, improve it later.
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}