package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * approach : a pretty bruteforce method., could have been solved in little fenesse
 */
public class CellsWithOddValuesInMatrix {
    public int oddCells(int n, int m, int[][] indices) {

        int[][] rows = new int[n][m];
        for (int scan = 0; scan < indices.length; scan++) {
            int row = indices[scan][0];
            int col = indices[scan][1];
            for (int i = 0; i < m; i++) { //addressing rows
                rows[row][i] = rows[row][i] + 1;
            }
            for (int i = 0; i < n; i++) {
                rows[i][col] = rows[i][col] + 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
