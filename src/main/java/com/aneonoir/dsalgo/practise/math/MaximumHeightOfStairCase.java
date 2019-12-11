package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/maximum-height-of-the-staircase/0
 * <p>
 * Approach: initially i thought to find the factors and see if it can be modeled around n*(n+1)/2
 * <p>
 * TODO: still could not come up with the right answer.
 * <p>
 * TODO:
 * <p>
 * can you do find factors off a given number, use sqrt instead of scanning all the numbers
 */
public class MaximumHeightOfStairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            System.out.println((int) Math.round(Math.sqrt(n * 2)));
        }

    }
}
