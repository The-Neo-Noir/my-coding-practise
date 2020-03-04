package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/height-of-heap/0
 *
 *
 *
 * tag: height,heap,easy,
 */
public class HeightOfHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int asd[] = new int[size];
            int ts = size;
            int i = 0;
            while (ts-- > 0) {
                asd[i] = sc.nextInt();
                i++;
            }
            int num = size / 2;
            int count = 1;
            while (num >= 2) {
                count++;
                num = num / 2;
            }
            // System.out.println(count);
            System.out.println((int) (Math.log10(size) / Math.log10(2))); // this can be a single line code
        }
    }
}