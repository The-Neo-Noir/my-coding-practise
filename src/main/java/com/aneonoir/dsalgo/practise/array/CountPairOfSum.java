package com.aneonoir.dsalgo.practise.array;

import java.util.Scanner;
/**
 * link: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum/0
 *
 * solution: Used o(n^2)
 * follow up : can you do better ? with extraspace ?
 * follow up : can you even do better ?
 *
 */
public class CountPairOfSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int k = 0;
            int arr[] = new int[n];
            while (n-- > 0) {
                arr[k++] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == sum) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
