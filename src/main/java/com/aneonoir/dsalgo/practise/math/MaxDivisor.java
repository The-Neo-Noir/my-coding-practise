package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: codeforces
 * <p>
 * approach: this is done using o(n) solution, quite bruteforce
 * <p>
 * can you solve it in O(1)
 */
public class MaxDivisor {

    @Test
    public void test() {
        assertEquals(9, maxDivisor(1, 10, 3));
    }

    int maxDivisor(int left, int right, int divisor) {
        int result = -1;
        for (int i = right; i >= left; i--) {
            if (i % divisor == 0) {
                result = i;
                System.out.println(i % divisor);
                break;
            }
        }
        return result;
    }

}
