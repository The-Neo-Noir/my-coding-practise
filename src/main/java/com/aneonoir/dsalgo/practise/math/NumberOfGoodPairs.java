package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/number-of-good-pairs/
 * <p>
 * approach: a bruteforce way was to find all the such pairs in in O(n^2)
 * <p>
 * Better approach
 * <p>
 * tag: array, easy , pair finding.
 *
 *
 * follow up: can you do better ? with extra space ? reduce the complexity ?
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}