package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/does-array-represent-heap/0
 * <p>
 * TODO: I did this one from right to left, ie find parent and check, but can you do it from left to right.
 * <p>
 * <p>
 * tag: easy, heap, interivew. warmup
 */
public class DoesArrayRepresentHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            boolean result = true;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i != 0) {
                    int par = (i - 1) / 2;
                    if (a[i] > a[par]) {
                        result &= false;
                    } else {
                        result &= true;
                    }
                }
            }
            System.out.println(result == true ? 1 : 0);
        }
    }
}
