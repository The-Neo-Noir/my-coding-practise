package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/nth-fibonacci-number/0
 * <p>
 * why so much struggle to find out the fibonnay
 * TODO: an interview questions.
 * <p>
 * tag: math, fibonancy,interview.
 */
public class NthFibonancy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int te = sc.nextInt();
        while (te-- > 0) {
            System.out.println(findFibN(sc.nextInt()));
        }
    }

    private static int findFibN(int n) {
        if (n == 1 || n == 2) return 1;
        int i = 1;
        int j = 1;
        for (int counter = 0; counter < n - 2; counter++) {
            int temp = j;
            j = (i + j) % 1000000007;
            i = temp;
        }
        return j;
    }
}
