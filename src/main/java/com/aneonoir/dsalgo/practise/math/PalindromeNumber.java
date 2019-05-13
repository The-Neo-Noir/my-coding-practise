package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *link : https://leetcode.com/problems/palindrome-number/
 *
 * Appoach 1: Use string and convert the reverse to checck if its pallindrome
 *
 * Approach 2: Use only mathematics, no string function;
 *
 *
 * TODO: do the solution
 */
public class PalindromeNumber {

    @Test
    public void testIsPalindome() {
        assertTrue(isPalindrome(0));
        assertTrue(isPalindrome(11));
        assertTrue(isPalindrome(121));
        assertFalse(isPalindrome(-121));

    }

    // Using only mathematical
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }else{
            return true;
        }
    }
}
