package com.aneonoir.dsalgo.practise.search;

/**
 * link: https://leetcode.com/problems/search-insert-position/
 * <p>
 * approach: should have done binary search ,
 * <p>
 * TODO: binary search approach.
 * tags: binary search, array, interview.s
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
            return 0;
        } else if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        } else {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                if (target <= nums[i]) {
                    result = i;
                    break;
                }
            }
            return result;
        }
    }
}
