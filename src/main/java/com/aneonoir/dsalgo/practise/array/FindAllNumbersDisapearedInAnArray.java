package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * todo: Runtime: 5 ms, faster than 86.08% of Java online submissions for Find All Numbers Disappeared in an Array.
 *
 * tag: tricky,array,missing-element
 */
public class FindAllNumbersDisapearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -1 * nums[Math.abs(nums[i]) - 1];
            }
        }
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
