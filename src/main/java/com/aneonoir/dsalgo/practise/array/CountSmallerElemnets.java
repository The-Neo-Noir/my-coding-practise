package com.aneonoir.dsalgo.practise.array;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/count-smaller-elements/0
 * <p>
 * TODO: can you do better than o(n2) ????
 * <p>
 * do it again .
 * <p>
 * <p>
 * tag: stack,queue,interview,
 */
public class CountSmallerElemnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sal[] = new int[n];
            for (int i = 0; i < sal.length; i++) {
                sal[i] = sc.nextInt();
            }
            for (int i = 0; i < sal.length; i++) {
                int val = sal[i];
                int count = 0;
                for (int j = i + 1; j < sal.length; j++) {
                    if (sal[j] < val) {
                        count++;
                    }
                }
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
