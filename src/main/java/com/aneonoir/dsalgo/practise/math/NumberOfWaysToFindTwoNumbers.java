package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/number-of-ways-to-find-two-numbers/0
 * <p>
 * approacH: a brute force one, I think it can be imporved.
 * <p>
 * tag: interview, array, hash
 */
public class NumberOfWaysToFindTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int in = sc.nextInt();
            int count = 0;
            for (int i = 1; i < in; i++) {
                for (int j = i + 1; j < in; j++) {
                    if (i + j <= in) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}