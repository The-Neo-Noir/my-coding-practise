package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/missing-number/submissions/
 * <p>
 * appraoch: use the formulat n(n+1)/2
 * <p>
 * tag: math, interview.
 */
public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            sum += nums[i];
        }
        return (max * (max + 1) / 2) - sum;
    }
}
