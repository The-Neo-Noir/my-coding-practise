package com.aneonoir.dsalgo.practise.warmup;

import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class AVeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
        long sum = 0;
        int currentIndex = 0;
        while (currentIndex < ar.length) {
            sum += ar[currentIndex++];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
