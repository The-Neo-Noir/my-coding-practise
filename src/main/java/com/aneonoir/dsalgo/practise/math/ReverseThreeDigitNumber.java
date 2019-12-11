package com.aneonoir.dsalgo.practise.math;

/**
 * https://www.lintcode.com/problem/reverse-3-digit-integer/
 */
public class ReverseThreeDigitNumber {
    public int test(int number) {

        return ((number % 10) * 100) + ((number / 10) % 10) * 10 + (number / 100);
    }
}
