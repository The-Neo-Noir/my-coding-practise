package com.aneonoir.dsalgo.practise.dynamicprogramming;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/reducing-dishes/
 *
 * TODO: a failed attempt , must try to do it again
 *
 * tag: hard , interview, dynamic programming
 *
 */

public class ReducingDishes {
    public static void main(String[] args) {
        ReducingDishes sd = new ReducingDishes();
        int i = sd.maxSatisfaction(new int[]{76, 83, 55, -36, -8, 40, -60, -72, 27, -32, 37, 1, 77, 24, -46, -26, 20, -89, -35, -99, 58, -7});
        System.out.println();

        System.out.println(i);
    }

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        Arrays.stream(satisfaction).forEach(System.out::print);
        int max = satisfaction[satisfaction.length - 1];
        if (max <= 0) return 0;
        if (satisfaction[0] >= 0) {
            int sum = 0;
            for (int i = 0; i < satisfaction.length; i++) {
                sum += satisfaction[i] * (i + 1);
            }
            return sum;
        } else {
            int c = 0;
            while (Math.abs(satisfaction[c]) >= max) {
                c++;
            }
            int sum = 0;
            int counter = 1;
            c = 1;
            for (int i = c; i < satisfaction.length; i++) {
                sum += satisfaction[i] * counter;
                counter++;
            }
            return sum;
        }
    }
}
