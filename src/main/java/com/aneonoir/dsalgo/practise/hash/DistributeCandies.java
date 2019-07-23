package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/distribute-candies/submissions/
 * approach: cheated a bit, but I did the map.put(map.get(i),<--- this is wrong , it should have been map.put(i,..)
 */
public class DistributeCandies {

    public static void main(String[] args) {
        distributeCandies(new int[]{1, 1, 2, 2, 3, 3,});
    }

    public static int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i : candies) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        result = map.keySet().size();
        return Math.min(result, candies.length / 2);
    }

}