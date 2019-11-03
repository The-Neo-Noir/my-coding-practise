package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link:    https://practice.geeksforgeeks.org/problems/adding-one/0
 * <p>
 * apporach: looking at the input , it made sense to traverse elments from the end and do
 * the calculations yoursleves, however it timed out.
 * <p>
 * tags: math, array
 * TODO:
 */
public class AddingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int items = sc.nextInt();
            int a[] = new int[items];
            for (int j = 0; j < items; j++) {
                a[j] = sc.nextInt();
            }
            int result[] = output(a);
            for (Integer ab : result) {
                System.out.print(ab + " ");
            }
            System.out.println();
        }
    }

    private static int[] output(int[] a) {
        int carry = 0, data = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (carry == 1) data = 0;
            int temp = a[i] + data + carry;
            if (temp > 9) {
                a[i] = 0;
                carry = 1;
            } else {
                a[i] = temp;
                break;
            }
        }
        if (carry == 1) {
            int result[] = new int[a.length + 1];
            result[0] = 1;
            return result;
        }
        return a;
    }
}
