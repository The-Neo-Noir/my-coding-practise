package com.aneonoir.dsalgo.practise.oopd;

/**
 * link: https://www.hackerrank.com/challenges/java-exception-handling/problem
 */
public class JavaExceptionTwo {
    /*
     * Create the method long power(int, int) here.
     */
    long power(int n, int p) throws Exception {
        if (n == 0 & p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        if (n <= -1 || p <= -1) {
            throw new Exception("n or p should not be negative.");
        }
        return (long) Math.pow(n, p);
    }

}

