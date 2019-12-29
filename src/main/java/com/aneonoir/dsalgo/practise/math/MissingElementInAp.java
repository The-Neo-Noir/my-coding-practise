package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/missing-element-of-ap/0/
 * <p>
 * apporoach : read the code.
 * <p>
 * tag: interview, maths, arthimatic progression,
 */
public class MissingElementInAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        while (in-- > 0) {
            int n = sc.nextInt();

            int[] as = new int[n];
            int i = 0;
            while (n-- > 0) {
                as[i++] = sc.nextInt();
            }


            int smallestDifference = as[1] - as[0];
            int loc = as[0];
            for (int j = 1; j < as.length - 1; j++) {
                int diff = as[j + 1] - as[j];
                if (diff <= smallestDifference) {
                    smallestDifference = diff;
                } else {
                    loc = as[j];
                }
            }
            if (as.length == 2) {
                System.out.println((as[1] + as[0]) / 2);

            } else {
                System.out.println(loc + smallestDifference);
            }

        }
    }
}