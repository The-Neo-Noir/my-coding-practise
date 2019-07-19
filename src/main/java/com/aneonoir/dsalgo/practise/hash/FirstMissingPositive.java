package com.aneonoir.dsalgo.practise.hash;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

/**
 * link: https://leetcode.com/problems/first-missing-positive/
 * <p>
 * <p>
 * challenge: Your algorithm should run in O(n) time and uses constant extra space.  The version 2 of the
 * code below solve it
 */
public class FirstMissingPositive {

    @Test
    public void test() {
        assertEquals(3, firstMissingPositive(new int[]{1, 0, 2}));
        assertEquals(2, firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, firstMissingPositive(new int[]{7, 8, 9, 11, 12}));

        assertEquals(3, firstMissingPositiveV2(new int[]{1, 0, 2}));
        assertEquals(2, firstMissingPositiveV2(new int[]{3, 4, -1, 1}));
        assertEquals(1, firstMissingPositiveV2(new int[]{7, 8, 9, 11, 12}));

    }

    public int firstMissingPositiveV2(int[] nums) {
        int i = 1;
        int result = -1;
        HashSet<Integer> integers = new HashSet<>();

        for (int j = 0; j < nums.length; j++) {
            integers.add(nums[j]);
        }

        for (int j = 1; j < Integer.MAX_VALUE; j++) {
            if (!integers.contains(j)) {
                result = j;
                break;
            }
        }
        return result;
    }

    public int firstMissingPositive(int[] nums) {
        int i = 1;
        int result = -1;
        while (true) {
            boolean flag = true;
            for (int index = 0; index < nums.length; index++) {
                if (i == nums[index]) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                result = i;
                break;
            }
            i++;
        }
        return result;
    }

}
