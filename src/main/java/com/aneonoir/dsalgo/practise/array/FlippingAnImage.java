package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/flipping-an-image/submissions/
 * <p>
 * approach: solved in a brute force ,  I believe it could be improved TODO:
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length / 2; col++) {
                int temp = A[row][col];
                A[row][col] = A[row][A[row].length - 1 - col];
                A[row][A[row].length - 1 - col] = temp;
            }
            for (int col = 0; col < A[row].length; col++) {
                A[row][col] = invertBit(A[row][col]);
            }
        }
        return A;
    }

    public int invertBit(int bit) {
        return bit == 1 ? 0 : 1;
    }
}