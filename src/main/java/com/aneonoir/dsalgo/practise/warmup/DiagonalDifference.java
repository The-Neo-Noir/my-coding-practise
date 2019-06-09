package com.aneonoir.dsalgo.practise.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int leftToRightDiagnal = 0;
        int rightToLeftDiagnal = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    leftToRightDiagnal += a[a_i][a_j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            rightToLeftDiagnal += a[i][(n - 1) - i];
        }
        System.out.println(java.lang.Math.abs(leftToRightDiagnal - rightToLeftDiagnal));
    }
}
