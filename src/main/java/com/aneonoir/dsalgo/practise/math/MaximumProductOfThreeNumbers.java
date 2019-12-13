package com.aneonoir.dsalgo.practise.math;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/maximum-product-of-three-numbers/solution/
 * <p>
 * approach: used sorting , can you solve it using on O(n) ??
 * <p>
 * TOOD: interview, math,
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[nums.length - 1] * nums[0] * nums[1]);
    }
}
