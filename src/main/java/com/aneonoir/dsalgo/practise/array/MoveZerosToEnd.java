package com.aneonoir.dsalgo.practise.array;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array/0
 * <p>
 * approach: too many for loops, can you do better ?
 * <p>
 * TODO: try it again.
 * <p>
 * tags: array, zeros to the end
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int countZero = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    countZero++;
                }
            }
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index] = arr[i];
                    index++;
                }
            }
            for (int i = arr.length - countZero; i < arr.length; i++) {
                arr[i] = 0;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}