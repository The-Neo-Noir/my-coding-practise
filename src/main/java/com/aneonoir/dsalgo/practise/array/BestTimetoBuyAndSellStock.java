package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * todo: improve it further, this can be done in O(n) , but the one below takes O(n2) time.
 *
 * tag: easy, sliding-window, dynamic programming, interview
 *
 */
public class BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max) max = prices[j] - prices[i];
            }
        }
        return max < 0 ? 0 : max;
    }
}
