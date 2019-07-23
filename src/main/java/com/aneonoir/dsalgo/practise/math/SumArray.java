package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-array-puzzle/1
 */
public class SumArray {
    public static void SumArray(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print((total - arr[i]) + " ");
        }
    }

}
