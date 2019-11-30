package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/majority-element/solution/
 * <p>
 * approach: I did two loops one for populating a map, and then other to check which one has value > n/2.
 * <p>
 * Runtime: 9 ms, faster than 48.30% of Java online submissions for Majority Element.
 * Memory Usage: 40.7 MB, less than 99.26% of Java online submissions for Majority Element.
 * Slow :
 * Now removing the second for loop . still similar runtime outlook.
 * <p>
 * THere are different strategeries poeple have solved it. TODO
 * <p>
 * tag: interview, hash,array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        int major = nums.length / 2;
        for (Integer num : nums) {
            Integer val = map.getOrDefault(num, 0) + 1;
            if (val > major) {
                result = num;
                break;
            }
            map.put(num, val);
        }
        return result;
    }
}
