package com.aneonoir.dsalgo.practise.binarysearch;

/**
 * link: https://leetcode.com/problems/binary-search/
 * <p>
 * approacH: solved in recursion , todo; non-recursive
 * struggle: mid calculation and left<=right, i thought left<right
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        return binSearch(0, nums.length - 1, nums, target);
    }

    int binSearch(int left, int right, int[] nums, int target) {
        if (left <= right) {
            int mid = (right - left / 2) + left;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return binSearch(mid + 1, right, nums, target);
            } else {
                return binSearch(0, mid - 1, nums, target);
            }
        } else {
            return -1;
        }

    }
}
