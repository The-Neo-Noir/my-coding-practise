package com.aneonoir.dsalgo.practise.array;

/**
 * linK: https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1
 * <p>
 * TODO: Can you do it better ?
 */
public class IndexOfExtraElement {
    public int findExtra(int a[], int b[], int n) {
        int target[] = b;
        int source[] = a;
        if (a.length < b.length) {
            target = a;
            source = b;
        }
        int result = -1;
        for (int i = 0; i < target.length; i++) {
            if (source[i] != target[i]) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            result = source.length - 1;
        }
        return result;
    }
}