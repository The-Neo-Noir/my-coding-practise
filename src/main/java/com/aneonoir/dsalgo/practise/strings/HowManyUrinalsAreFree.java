package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://www.codewars.com/kata/5e2733f0e7432a000fb5ecc4/train/java
 * <p>
 * got the test cases wrong.
 *
 * todo: wrong output.
 * <p>
 * tag: good warm up.
 */
public class HowManyUrinalsAreFree {
    public static int getFreeUrinals(String urinals) {
        int possible = urinals.length() % 2 == 0 ? urinals.length() / 2 : (urinals.length() / 2) + 1;

        char prev = urinals.charAt(0);
        int count = prev == '1' ? 1 : 0;
        boolean result = true;
        for (int i = 1; i < urinals.length(); i++) {
            if (urinals.charAt(i) == '1' && prev == '1') {
                result = false;
                break;
            }
            if (urinals.charAt(i) == '1') count++;
            prev = urinals.charAt(i);
        }
        if (result) {
            return possible - count;
        } else {
            return -1;
        }

    }
}
