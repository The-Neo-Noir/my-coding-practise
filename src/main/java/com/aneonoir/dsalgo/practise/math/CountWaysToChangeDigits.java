package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: https://app.codesignal.com/challenge/YfXvndTvZuDcMbSFY
 * <p>
 * <p>
 * struggle: don't forget to
 */
public class CountWaysToChangeDigits {


    @Test
    public void testin() {
        assertEquals(17, countWaysToChangeDigit(10));

    }


    int countWaysToChangeDigit(int value) {

        return String.valueOf((int) (Math.pow(10, (value + "").length()) - 1) - value)
                .chars().map(Character::getNumericValue).reduce(0, (left, right) -> left + right);

    }


}

