package com.aneonoir.dsalgo.practise.recursion;

import java.util.Scanner;

/**
 *
 * link: https://practice.geeksforgeeks.org/problems/number-of-paths/0
 *
 *  major struggle,
 *
 *  tag: path, array , recursion.
 */
public class PrintPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        char ar[][] = new char[row][col];
        char init = 'A';
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                ar[r][c] = init;
                init++;
            }
        }
        StringBuffer sb = new StringBuffer("");
        printer(0, 0, ar, "");
        printPathCount(row-1,col-1);
    }

    private static void print(char[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void printPathCount(int rowIndex, int colIndex){

    }
    private static void printer(int row, int col, char[][] ar, String sb) {
        if (row == ar.length - 1 && col == ar[row].length - 1) {
            System.out.print(sb + ar[row][col]+ ",");
        } else if (row <= ar.length - 1 && col <= ar[row].length - 1) {

            printer(row + 1, col, ar, sb+ar[row][col]);
            printer(row, col + 1, ar, sb+ar[row][col]);
        } else {
            return;
        }
    }
}
