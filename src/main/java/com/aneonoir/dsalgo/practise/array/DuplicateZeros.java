package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/duplicate-zeros/
 * <p>
 * approach: a bruteforce once, got me passed, but need to improve on this.
 * <p>
 * here is the outcome of the run from leet codel
 * <p>
 * Runtime: 17 ms, faster than 18.80% of Java online submissions for Duplicate Zeros.
 * Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Duplicate Zeros.
 * <p>
 * solution:
 * <p>
 * <p>
 * TODO: try a better approach.
 * <p>
 * gotchas , remember to check the boundary conditions. s
 * <p>
 * tag: interview, array right shift by one, array.
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i + 1 < arr.length) {
                    int temp = arr[i + 1];
                    arr[i + 1] = 0;
                    int temp2 = temp;
                    for (int j = i + 2; j < arr.length; j++) {
                        temp2 = arr[j];
                        arr[j] = temp;
                        temp = temp2;
                    }
                    i++;
                }
            }
        }
    }
}
