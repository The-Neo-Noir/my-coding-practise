package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link: https://leetcode.com/problems/range-sum-query-2d-immutable/
 *
 * approach: precalculate the sums of each row , and d
 *
 * TODO: There is still some better approach, you must find and learn.
 *
 * tag: medium , dynamic programming,
 */
public class RangeSumQuery2DImmutable {
    int pre[][];

    public RangeSumQuery2DImmutable(int[][] matrix) {
        if (matrix != null && matrix.length != 0) {
            pre = new int[matrix.length][matrix[0].length];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (col == 0) {
                        pre[row][col] = matrix[row][col];
                    } else {
                        pre[row][col] = pre[row][col - 1] + matrix[row][col];
                    }
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (pre == null) return 0;
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            if (col1 == 0) {
                sum += pre[i][col2];
            } else {
                sum += (pre[i][col2] - pre[i][col1 - 1]);
            }
        }
        return sum;
    }
}
