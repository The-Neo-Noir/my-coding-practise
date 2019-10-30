package com.aneonoir.dsalgo.practise.sorting;

/**
 * link: https://leetcode.com/problems/sort-array-by-parity-ii/
 * <p>
 * Solution: TODO analysis, I think the solution is wrong even though it is accepted. I AM NOT DOING ANY SORTING ATALL !!!!
 */
public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {
        int evenIndex = 0;
        int oddIndex = 1;
        int[] result2 = new int[A.length];
        for (int result = 0; result < result2.length; result++) {
            if (A[result] % 2 == 0) {
                result2[evenIndex] = A[result];
                evenIndex = evenIndex + 2;
            } else {
                result2[oddIndex] = A[result];
                oddIndex = oddIndex + 2;
            }
        }
        return result2;
    }
}
