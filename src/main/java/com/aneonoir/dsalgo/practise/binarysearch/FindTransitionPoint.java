package com.aneonoir.dsalgo.practise.binarysearch;

/**
 * link: https://practice.geeksforgeeks.org/problems/find-transition-point/1
 * <p>
 * tag: binary search, array, transition point, interview
 */
public class FindTransitionPoint {

    int transitionPoint(int arr[], int n) {
        return transitionPoint(arr, 0, arr.length - 1);
    }

    int transitionPoint(int arr[], int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) {
                if (arr[mid + 1] == 1) return mid + 1;
                return transitionPoint(arr, mid + 1, high);
                // go right;
            } else {
                if (arr[mid - 1] == 0) return mid;
                return transitionPoint(arr, low, mid - 1);
                // go left
            }
        } else {
            return -1;
        }
    }
}
