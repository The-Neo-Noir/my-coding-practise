package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/array-partition-i/
 * <p>
 * solution: Intuitively ; sort and take each pair
 * <p>
 * Runtime: 14 ms, faster than 93.02% of Java online submissions for Array Partition I.
 * Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Array Partition I.
 * <p>
 * TODO: try a different approach
 * <p>
 * tag: array,sort,trick.
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
