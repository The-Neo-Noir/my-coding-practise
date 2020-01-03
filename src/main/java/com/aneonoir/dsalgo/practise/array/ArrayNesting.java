package com.aneonoir.dsalgo.practise.array;

import java.util.HashSet;

/**
 * link: https://leetcode.com/problems/array-nesting/
 * <p>
 * approach :
 * 1. I started off with a bruteforce with single hash, and it gave me TLE, then I used another set , to store it in the sedond attempt.
 * <p>
 * RUNTIME: Runtime: 25 ms, faster than 9.71% of Java online submissions for Array Nesting.
 * Memory Usage: 43.6 M
 * <p>
 * TODO: can still be done faster.
 * <p>
 * tag: array, interview, medium, optimization
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int max = 0;
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int counter = 1;
            HashSet<Integer> set = new HashSet<>();
            int start = nums[i];
            set.add(start);
            st.add(start);
            while (true) {
                start = nums[start];
                if (st.contains(start) || set.contains(start)) {
                    break;
                } else {
                    set.add(start);
                    st.add(start);
                }
                counter++;
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }
}
