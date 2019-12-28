package com.aneonoir.dsalgo.practise.math;

/**
 * link:  https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * <p>
 * TODO: recursively ?
 * <p>
 * <p>
 * tag: maths,
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n /= 10;
        }
        return product - sum;
    }
}
