package com.aneonoir.dsalgo.practise.binarysearch;

import java.util.Scanner;

/**
 *
 *
 * tag: repeat, interview, binary search, floor, struggle.
 *
 * struggle: binary search low<=high , and low+(high-low)/2 , remember these .
 */
public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (k < arr[0]) {
                System.out.println("-1");
            } else if (k > arr[n - 1]) {
                System.out.println(n - 1);
            } else {
                System.out.println(search(arr, 0, n - 1, k));
            }
        }
    }

    private static int search(int arr[], int low, int high, int k) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                return search(arr, mid + 1, high, k);
            } else {
                return search(arr, low, mid - 1, k);
            }
        } else {
            return low - 1;
        }
    }
}
