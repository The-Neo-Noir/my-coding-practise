package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MinimalNumberOfCoins {

    @Test
    public void test() {
        assertEquals("****", createDecoration("*", 4));
        assertEquals(6, minimalNumberOfCoins(new int[]{1, 2, 8}, 28));
    }


    String createDecoration(String character, int count) {
        String[] sd = new String[count];
        Arrays.fill(sd, character);
        return Arrays.toString(sd);
    }

    int minimalNumberOfCoins(int[] coins, int price) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (price == 0) {
                return count;
            } else {
                count += (price / coins[i]);
                price = price - ((price / coins[i]) * coins[i]);
            }
        }
        return count;
    }
}
