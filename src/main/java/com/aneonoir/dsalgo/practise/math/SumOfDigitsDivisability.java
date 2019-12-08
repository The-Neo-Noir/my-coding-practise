package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-of-digits-divisibility/0
 * <p>
 * tag: math
 */
public class SumOfDigitsDivisability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int input = sc.nextInt();
            int sum = 0;
            int re = input;
            while (input > 0) {
                sum += (input % 10);
                input = input / 10;
            }
            System.out.println((re % sum == 0) ? 1 : 0);
        }
    }
}
