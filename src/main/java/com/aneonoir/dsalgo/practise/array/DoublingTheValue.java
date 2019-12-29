package com.aneonoir.dsalgo.practise.array;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/doubling-the-value/0/
 * <p>
 * <p>
 * tag: math,overflow, long. interview.
 */
public class DoublingTheValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long b = sc.nextLong();
            long as[] = new long[n];
            for (int i = 0; i < n; i++) {
                as[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                if (as[i] == b) {
                    b = b * 2;
                }
            }
            System.out.println(b);
        }
    }
}
