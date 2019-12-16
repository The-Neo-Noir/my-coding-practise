package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link: https://leetcode.com/problems/unique-paths/submissions/
 *
 * tag: interview,dynamic programming
 */
public class Uni {

    int[][] store = null;

    public static void main(String[] args) {
        int i = new Uni().uniquePaths(19, 13);
        System.out.println(i);
    }

    public int uniquePaths(int m, int n) {
        store = new int[m + 1][n + 1];

        return sd(m, n);
    }

    public int sd(int m, int n) {
        if (m == 1 && n == 1)
            return 1;
        if (m < 1 || n < 1) {
            return 0;
        }

        if (store[m][n] != 0) {
            return store[m][n];
        } else {
            store[m][n] = sd(m, n - 1) + sd(m - 1, n);
            return store[m][n];
        }
    }
}