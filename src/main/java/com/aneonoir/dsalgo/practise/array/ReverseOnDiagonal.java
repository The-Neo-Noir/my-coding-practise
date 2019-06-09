package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-backwoods/Akspcu9ewiYapWkrp
 */
public class ReverseOnDiagonal {
    int[][] reverseOnDiagonals(int[][] matrix) {
        int matrixColLength = matrix[0].length;
        for (int i = 0; i < matrix.length / 2; i++) {
            swap(matrix, i, i, matrix.length - (i + 1), matrix.length - (i + 1));
            swap(matrix, i, matrix.length - (i + 1), matrix.length - (i + 1), i);
        }
        return matrix;
    }

    void swap(int[][] matrix, int srow, int scol, int trow, int tcol) {
        int temp = matrix[srow][scol];
        matrix[srow][scol] = matrix[trow][tcol];
        matrix[trow][tcol] = temp;
    }

}
