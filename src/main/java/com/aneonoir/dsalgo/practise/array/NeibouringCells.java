package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/challenge/cCp2KatYhxeXPtG7a
 * <p>
 * tag: matrix,array,interview.
 */
public class NeibouringCells {
    public static void main(String[] args) {
        neighboringCells(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
    }

    static int[][] neighboringCells(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (col - 1 >= 0) {
                    count++;
                }
                if (col + 1 < matrix[row].length) {
                    count++;
                }
                if (row - 1 >= 0) {
                    count++;
                }
                if (row + 1 < matrix.length) {
                    count++;
                }
                result[row][col] = count;
                count = 0;
            }

        }
        // 0,1
        return result;
    }

}
