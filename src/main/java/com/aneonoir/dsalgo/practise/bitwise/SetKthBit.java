package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://practice.geeksforgeeks.org/problems/set-kth-bit/0
 */

import java.util.Scanner;

public class SetKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();
            int shift = sc.nextInt();
            result(num, shift);
        }
    }

    static void result(int num, int shift) {
        System.out.println(num | (1 << shift));
    }
}
