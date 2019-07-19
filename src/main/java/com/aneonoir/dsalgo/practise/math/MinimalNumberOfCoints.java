package com.aneonoir.dsalgo.practise.math;

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

        return count;
    }

}
