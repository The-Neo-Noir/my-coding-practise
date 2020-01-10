package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/challenge/PG2nQ9fDwfhhyBEQn
 *
 * approach: simple except the gotcha, a/b==c woont happen, you rather do it as a==b*c
 *
 * tag: easy,
 * TODO: write some concise code
 */
public class ArithmaticExpression {
    boolean arithmeticExpression(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (a * b == c) {
            return true;
        } else if (a == b * c) {
            return true;
        } else if (a - b == c) {
            return true;
        } else {
            return false;
        }
    }

}
