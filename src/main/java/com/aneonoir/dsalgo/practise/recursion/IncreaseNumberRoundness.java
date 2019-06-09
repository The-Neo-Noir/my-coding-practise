package com.aneonoir.dsalgo.practise.recursion;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/loop-tunnel/KLbRMcWhaZi3dvYH5
 */
public class IncreaseNumberRoundness {

    boolean increaseNumberRoundness(int n) {
        return n / 10 != 0 && (n % 10 != 0 && (n / 10) % 10 == 0 || increaseNumberRoundness(n / 10));
    }
}
