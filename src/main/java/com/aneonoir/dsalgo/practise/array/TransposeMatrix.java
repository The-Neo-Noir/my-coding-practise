package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/transpose-matrix/
 * <p>
 * TODO: can you do it recursively  ?
 * <p>
 * tag: matrix,array, warmup, interview.
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int row = 0; row < A.length; row++) { // 2
            for (int col = 0; col < A[row].length; col++) { //3
                result[col][row] = A[row][col];
            }
        }
        return result;
    }
}
