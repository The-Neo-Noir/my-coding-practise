package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link:https://www.lintcode.com/problem/minimum-path-sum/description
 * <p>
 * approach: start from the destination ( the last row, and last col) and count till
 * the 0,0 index. In every cell, count the min between the down and the right
 * the answer is in the 0,0 th index.
 * <p>
 * TODO: can you do it recursively ?
 * <p>
 * tag: interview,dp,dynamic programming,
 */
public class MinPathSum {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        for (int row = grid.length - 1; row >= 0; row--) {
            for (int col = grid[row].length - 1; col >= 0; col--) {
                int right = 0, down = 0;
                boolean check = true;
                if (col + 1 <= grid[row].length - 1) {
                    right = grid[row][col + 1];
                } else {
                    check = false;
                }
                if (row + 1 <= grid.length - 1) {
                    down = grid[row + 1][col];
                } else {
                    check = false;
                }
                if (check) {
                    grid[row][col] += Math.min(right, down);

                } else {
                    grid[row][col] += Math.max(right, down);
                }
            }
        }
        return grid[0][0];
    }
}