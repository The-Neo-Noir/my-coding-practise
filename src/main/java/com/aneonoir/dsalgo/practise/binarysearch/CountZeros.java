package com.aneonoir.dsalgo.practise.binarysearch;

import java.util.Scanner;


/**
 * link: https://practice.geeksforgeeks.org/problems/count-the-zeros/0
 * Did a good amount of calculations on different size ,even sizeed, and odd sized,
 * A must do for interview practise it  a lot.
 * <p>
 * <p>
 * tag: practise,binary search,
 */
public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int items = sc.nextInt();
            int[] input = new int[items];
            for (int i = 0; i < items; i++) {
                input[i] = sc.nextInt();
            }
            if (input[0] == 0 && input[items - 1] == 0) {
                System.out.println(items);
            } else if (input[0] == 1 && input[items - 1] == 1) {
                System.out.println(0);
            } else {
                System.out.println(items - searchForStartingZero(input, 0, input.length - 1));

            }
        }
    }

    private static int searchForStartingZero(int[] input, int low, int high) {
        if (low <= high) {
            int index = (low + high) / 2;
            if (input[index] == 0) {
                return searchForStartingZero(input, low, index - 1);
            } else {
                return searchForStartingZero(input, index + 1, high);
            }
        } else {
            return low;
        }
    }
}