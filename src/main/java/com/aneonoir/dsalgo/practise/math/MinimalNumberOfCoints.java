package com.aneonoir.dsalgo.practise.math;

import java.util.Arrays;

/**
 * link; https://app.codesignal.com/challenge/jmv55DMT7ywJaPcsC
 */
public class MinimalNumberOfCoints {

    int minimalNumberOfCoins(int[] coins, int price) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            count += (price / coins[i]);
            price = price % coins[i];
        }
        boolean[][] matrix = new boolean[][]{{false, true, true},
                {true, false, false}};
        Arrays.stream(matrix).forEach().forEach((ele) -> {
            ele ? count++ : null;
        });
        Arrays.stream(matrix).forEach();
        return count;
    }

}
