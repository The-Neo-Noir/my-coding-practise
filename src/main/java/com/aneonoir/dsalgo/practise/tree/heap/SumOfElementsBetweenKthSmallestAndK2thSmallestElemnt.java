package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements/0
 * <p>
 * todo: a fantastic interview question, a must do again.
 * <p>
 * tag: todo, intervew, medium,
 */
public class SumOfElementsBetweenKthSmallestAndK2thSmallestElemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] a = new int[size];
            int i = 0;
            while (size-- > 0) {
                a[i++] = sc.nextInt();
            }
            Arrays.sort(a);
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            int low = -1;
            int high = -1;
            if (k1 + 1 <= a.length) {
                low = k1;
            }

            if (k2 <= a.length) {
                high = k2 - 2;
            } else {
                high = a.length - 1;
            }
            long sum = 0l;

            if (low != -1 && low <= high) {
                for (int l = low; l <= high; l++) {
                    sum += a[l];
                }
            }
            System.out.println(sum);
        }
    }
}
