package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: https://app.codesignal.com/arcade/intro/level-12/NJJhENpgheFRQbPRA/comments
 */
public class DigitsProduct {

    @Test
    public void test() {
        assertEquals(-1, digitsProduct(19));
    }

    int digitsProduct(int product) {
        int result = -1;
        int i = 1;
        while (true) {
            if (IsProductOfDigit(i, product)) {
                result = i;
                break;
            }
            i++;
        }
        return result;
    }

    boolean IsProductOfDigit(int number, int product) {
        int calculated = 1;
        while (number > 0) {
            calculated = calculated * (number % 10);
            number = number / 10;
        }
        return product == calculated;
    }

}
