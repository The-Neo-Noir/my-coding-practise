package com.aneonoir.dsalgo.practise.twopointer;

/**
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
 *
 *  practise enough , understand why this works.
 *
 *  runtime O(n)
 *
 *  todo: can you do it recursively ?
 *
 *  tag: dynamic programming, two pointer, sliding window,  easy, interview.
 */
public class BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;

        if (prices.length < 2) return 0;

        int low = 0;
        int high = 1;
        while (high < prices.length) {
            int curr = prices[high] - prices[low];
            if (curr < 0) {
                low = high;
                high++;
            } else {
                if (curr > max) {
                    max = curr;
                }
                high++;
            }
        }
        return max < 0 ? 0 : max;

    }
}
