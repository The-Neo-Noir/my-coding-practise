package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-backwoods/kfwTN8pdx9uP8bcHS/solutions
 * <p>
 * struggle : Yes, the code is very lengthy , can you solve it better ?
 */
public class SwapDiagonals {

    int[][] swapDiagonals(int[][] matrix) {
        int sColInc = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            int sRow = i;
            int sCol = i;
            int tRow = i;
            int tCol = matrix.length - (i + 1);

            int temp = matrix[sRow][sCol];
            matrix[sRow][sCol] = matrix[tRow][tCol];
            matrix[tRow][tCol] = temp;
            sColInc++;
        }

        int j = 0;
        for (int i = matrix.length; i > matrix.length / 2; i--) {
            int sRow = i - 1;

            int tRow = i - 1;
            int tCol = (i - 1);
            int sCol = j;

            int temp = matrix[sRow][sCol];
            matrix[sRow][sCol] = matrix[tRow][tCol];
            matrix[tRow][tCol] = temp;
            j++;
        }
        return matrix;
    }

}
