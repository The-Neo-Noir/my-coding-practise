package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link: https://www.lintcode.com/problem/range-sum-query-immutable/description
 * <p>
 * approach: used a top down approach, to solve it.
 * TODO: can you solve it bottom up approach with memoization ?
 * <p>
 * <p>
 * tag: dynamic programming,interview,
 */
public class RangeSumQuery {
    private int[] cal;

    public RangeSumQuery(int[] nums) {
        this.cal = nums;
        if (nums != null) {
            cal[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                cal[i] = cal[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (cal == null) return 0;
        int val = i == 0 ? 0 : cal[i - 1];
        return cal[j] - val;
    }
}
