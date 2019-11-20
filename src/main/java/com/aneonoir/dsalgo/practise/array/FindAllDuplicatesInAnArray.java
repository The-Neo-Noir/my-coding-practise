package com.aneonoir.dsalgo.practise.array;

import java.util.LinkedList;
import java.util.List;

/**
 * link:
 * <p>
 * tag: interview,array,duplicate finding.
 * <p>
 * Solution: used trick I learned.
 * <p>
 * TODO: there are other methods to do it as well.
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int current = Math.abs(nums[i]);
            if (nums[current - 1] < 0) {
                list.add(Math.abs(nums[i]));
            } else {
                nums[current - 1] = -1 * nums[current - 1];
            }
        }
        return list;
    }
}
