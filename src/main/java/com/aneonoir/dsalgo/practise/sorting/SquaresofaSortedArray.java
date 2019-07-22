package com.aneonoir.dsalgo.practise.sorting;

/**
 * link: https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
 * <p>
 * apporach: initially I though I could sort the array removing the negative ( as negative sqaure Will be positive(
 * but latere realised In could use thesame for loop to solve it as i sort
 * <p>
 * I used a bubble sort, but quick sort can be used to solve it.TODO:
 */
public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (Math.abs(A[j]) > Math.abs(A[j + 1])) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
            A[A.length - 1 - i] = A[A.length - 1 - i] * A[A.length - 1 - i];
        }
        return A;
    }
}