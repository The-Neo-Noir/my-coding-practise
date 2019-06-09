package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * https://app.codesignal.com/arcade/code-arcade/labyrinth-of-nested-loops/yBFfNv5fTqhcacZ7w
 */
public class IsPower {

    @Test
    public void test() {
        assertTrue(isPower(125));
    }

    boolean isPower(int n) {
        boolean isPower = false;
        for (int i = 2; i < 20; i++) {
            int power = i;
            for (int j = 1; j < n / 2; j++) {
                power = power * i;
                if (power > n) {
                    break;
                }
                if (power == n) {
                    isPower = true;
                    break;
                }
            }
            if (isPower == true) break;
        }

        return isPower;
    }
}
