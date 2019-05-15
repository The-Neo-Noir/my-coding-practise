package com.aneonoir.dsalgo.practise.array;

import java.util.stream.IntStream;

/**
 * link: https://leetcode.com/problems/maximum-product-of-three-numbers/
 * <p>
 * Approach: quite some trivial, atleast as you think. Sort the number in ascending/descending
 * number and return the result, taking from last/fast three numbers.
 * <p>
 * Gotchas: what if numbers are negatives
 */
public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int as[] = {1, 3, 4};
        System.out.println(IntStream.of(as).filter(value -> value % 2 == 0).max().getAsInt());
    }
}
