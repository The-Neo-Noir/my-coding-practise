package com.aneonoir.dsalgo.practise.binarysearch;

/**
 * link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * <p>
 * <p>
 * tag: binary search,interview,
 * <p>
 * I had to look up for the solution.
 * TWO phase : find the pivot,
 * find the element .
 * <p>
 * Lots of gotchas, think of possible test cases, practise how to find the pivot
 * follow up : how to do it when duplicate is not allowed
 */
public class SearchInRotatedArray {

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int pivot = findPivot(nums);
        System.out.println(pivot);
        if (pivot == -1) {
            int low = 0;
            int high = nums.length - 1;
            return findElement(nums, low, high, target);
        } else {
            if (nums[pivot] == target) {
                return pivot;
            } else if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
                int low = pivot + 1;
                int high = nums.length - 1;
                return findElement(nums, low, high, target);
            } else {
                int low = 0;
                int high = pivot - 1;
                return findElement(nums, low, high, target);
            }
        }
    }

    private int findElement(int nums[], int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
                return findElement(nums, low, high, target);
            } else {
                high = mid - 1;
                return findElement(nums, low, high, target);
            }
        } else {
            return -1;
        }

    }

    private int findPivot(int[] nums) {
        if (nums[0] < nums[nums.length - 1])
            return -1;
        else {
            int low = 0;
            int high = nums.length - 1;
            int result = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (mid == nums.length - 1) {
                    result = mid;
                    break;
                } else if (nums[mid] > nums[mid + 1]) {
                    result = mid + 1;
                    break;
                } else if (nums[low] <= nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return result;
        }
    }
}
//  0 1 2 3 4 5 6
// [4,5,6,7,0,1,2]
// 2,1,0,7,6,5,4

// 4,6, 7, 8 , 2, 3
// 3 2  8 7    6  4
