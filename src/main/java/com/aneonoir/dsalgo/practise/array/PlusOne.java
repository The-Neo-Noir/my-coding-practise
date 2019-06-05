package com.aneonoir.dsalgo.practise.array;

/**
 * link: leetcode
 * <p>
 * approach1:
 * o(2n)=o(n)
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        int number = convertToIntegerAndPlusOne(digits);
        return converNumberToIntArray(number);

    }

    private int[] converNumberToIntArray(int number) {
        123;
        124;

        while (number > 0) {
            number % 10;
        }


    }

    private int convertToIntegerAndPlusOne(int[] digits) {
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            result += ((int) Math.pow(10, (digits.length - i) - 1)) * digits[i];
        }
        return result + 1;

    }
}
