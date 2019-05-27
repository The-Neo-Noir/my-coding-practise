package com.aneonoir.dsalgo.practise.recursion;

/**
 * link: https://leetcode.com/problems/fibonacci-number/
 * <p>
 * TODO: can you do  a non-recursive solution ?
 *
 * tag: recursion,dp,iterative,fibonanci
 */
public class FibonacciNumber {

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
