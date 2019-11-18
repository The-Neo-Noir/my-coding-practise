package com.aneonoir.dsalgo.practise.array;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/two-sum/submissions/
 * <p>
 * tags: array, two sum, math,hashmap,interview
 * <p>
 * TODO: can you do it for a mix of negative and positive number ?
 * TODO: can you find out if there are more than one solution ?
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
