package com.aneonoir.dsalgo.practise.hash;

import java.util.HashSet;

/**
 * link: https://www.interviewbit.com/problems/colorful-number/#
 * <p>
 * approach: find all the possiblility and see if each has occured before using a hash,
 * <p>
 * struggle, the loop conditional checks , AND WORST OF ALL WHY DON"T YOU CHeck for different cases. ?????
 * <p>
 * tag: interview,
 */
public class IsNumberColorFul {
    public int colorful(int A) {
        String a = A + "";
        int[] digits = new int[a.length()];
        int inc = 0;
        HashSet<Integer> ints = new HashSet<>();
        if (digits.length == 1) return 1;
        boolean result = true;
        for (Character ch : a.toCharArray()) {
            int digit = Integer.parseInt(ch + "");
            if (!ints.add(digit) || digit == 0) {
                result = false;
                break;
            }
            digits[inc++] = digit;
        }
        if (result) {
            for (int i = 2; i < digits.length; i++) {
                int digitNumber = i;
                for (int j = 0; j <= digits.length - digitNumber; j++) {
                    int mul = 1;
                    for (int k = 0; k < i; k++) {
                        mul *= digits[k + j];
                    }
                    if (!ints.add(mul)) {
                        result = false;
                        break;
                    }
                }
                if (!result) {
                    break;
                }
            }
            int mul = 1;
            for (int i = 0; i < digits.length; i++) {
                mul *= digits[i];
            }
            if (!ints.add(mul)) result = false;
        }
        return result ? 1 : 0;

    }
}
