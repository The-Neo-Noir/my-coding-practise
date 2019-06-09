package com.aneonoir.dsalgo.practise.warmup;

import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        int currentIndex = 0;
        while (currentIndex < n) {
            sum += ar[currentIndex++];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
