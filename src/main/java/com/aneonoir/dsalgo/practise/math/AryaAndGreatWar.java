package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/arya-and-the-great-war/0
 * approach: divide and remainder
 * <p>
 * gotcha: be worried about test cases.
 * 1,2,3,4,5
 */
public class AryaAndGreatWar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(callme(sc.nextInt()));
        }
    }

    private static int callme(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 2 == 1) {
                count++;
            }
            i = i / 2;

        }
        return count;
    }
}
