package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/well-of-integration/Z9opBsx5fX6XfQJdt/solutions
 */
public class AlphabetSubSequence {
    boolean alphabetSubsequence(String s) {
        boolean result = true;
        char previous = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= previous) {
                result = false;
                break;
            }
            previous = s.charAt(i);
        }
        return result;

    }

}
