package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/strong-number/0/
 * <p>
 * approach: pretty bruteforce, unless there is a trick involved.
 * as far as now, we have so far, the factorial can be hashed to make it faster,
 * <p>
 * note: 0! is 1;
 */
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int result = 0;
            int num = sc.nextInt();
            int back = num;
            while (num > 0) {
                result += fact(num % 10);
                num = num / 10;
            }
            if (back == result) {
                System.out.println("Strong");
            } else {
                System.out.println("Not Strong");
            }
        }
    }

    public static long fact(int num) {
        if (num == 0) {
            return 1;
        }
        long res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
