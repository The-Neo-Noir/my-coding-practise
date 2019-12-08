package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/product-is-even-or-odd/0
 * <p>
 * learning: product is odd if both the numbers unit place is odd , so no need to actually multiply to number to check
 * if product is even or odd.
 * <p>
 * Integer.parseInt(s.charAt(s.length() - 1) + "")
 */
public class ProductIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while (c-- > 0) {
            String s = sc.next();
            String t = sc.next();

            if (
                    (Integer.parseInt(s.charAt(s.length() - 1) + "") % 2 == 1) &&
                            (Integer.parseInt(t.charAt(t.length() - 1) + "") % 2 == 1)
            ) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }

        }
    }
}
