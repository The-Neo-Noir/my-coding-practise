package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/sort-array-by-parity/
 * <p>
 * approach: I used one extra space, to solve it. But can you use two pointer technqique for solving it ?
 */
public class SortArrayByPairty {
    public int[] sortArrayByParity(int[] A) {
        int result[] = new int[A.length];
        int even = 0;
        int odd = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[even] = A[i];
                even++;
            } else {
                result[odd] = A[i];
                odd--;
            }
        }
        return result;
    }
}
