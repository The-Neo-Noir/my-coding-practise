package com.aneonoir.dsalgo.practise.math;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/nearest-multiple-of-10/0
 * Nearest multiple of 10
 *  * approach: the simplest approach will be  use bigDecimal which solves the problem easily
 * followup : TODO:  can you do it without using bigdecimal ? Hint what makes a number multiple of 10 , do it using strings ??
 *
 */
public class NearestMultipleOfTen {

    public static void main(String asdf[]) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        for (int i = 0; i < i1; i++) {
            String input = sc.next();
            BigDecimal dix = new BigDecimal(input);
            int intValue = dix.remainder(new BigDecimal(10)).intValue();
            BigDecimal result = null;
            if (intValue > 5) {
                result = dix.add(new BigDecimal(10 - intValue));
            } else {
                result = dix.subtract(new BigDecimal(intValue));
            }
            System.out.println(result.toString());
        }
    }
}
