package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/max-consecutive-ones/
 * <p>
 * Initially I thought of counting 0 and its position, and subtracting the positoin from 0 and the upperbound.
 * Later I thought of two pointer approach, but I realised only one pointer is good enough.
 * <p>
 * though its fast, but its worth exploring the window technique.
 * <p>
 * Runtime: 2 ms, faster than 99.72% of Java online submissions for Max Consecutive Ones.
 * Memory Usage: 39.4 MB, less than 90.20% of Java online submissions for Max Consecutive Ones.
 * <p>
 * tags: interview, array , consecutive one, window technique
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentMax = 0;
        int oneP = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                oneP++;
            } else {
                if (currentMax < oneP) {
                    currentMax = oneP;
                }
                oneP = 0;
            }
        }
        if (oneP > currentMax)  /// edge case
            return oneP;
        return currentMax;
    }
}