package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class KidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> result = new  ArrayList<>(candies.length);
        for (Integer in : candies) {
            if (in + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
