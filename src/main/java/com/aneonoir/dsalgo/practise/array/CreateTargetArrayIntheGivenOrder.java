package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/create-target-array-in-the-given-order/
 *
 * tag: array,linkedlist,
 *
 * todo: can you do it without linkedlist
 */
public class CreateTargetArrayIntheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            in.add(index[i], nums[i]);
        }
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = in.get(i);
        }
        return result;
    }
}
