package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://practice.geeksforgeeks.org/problems/matrix-interchange-java/1
 * <p>
 * tag: warmup, array, column access
 */
public class MatrixColInterChange {
    static void interchange(int a[][], int r, int c) {

        for (int row = 0; row < a.length; row++) {
            int temp = a[row][0];
            a[row][0] = a[row][a[row].length - 1];
            a[row][a[row].length - 1] = temp;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}