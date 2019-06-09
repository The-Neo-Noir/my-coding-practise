package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: https://app.codesignal.com/arcade/intro/level-10/ppZ9zSufpjyzAsSEx
 * <p>
 * struggle: I had to do the debugging to figureout the failed test cases, took a fair amount of time
 */
public class BuildPallindrome {

    @Test
    public void test() {
        assertEquals("abaaba", buildPalindrome("abaa"));
        assertEquals("abababa", buildPalindrome("ababab"));
    }

    String buildPalindrome(String st) {
        String result = st;
        String reversedString = new StringBuffer(st).reverse().toString();
        int index = 0;
        if (st.equals(reversedString)) {
            result = reversedString;
        } else {
            int j = 0;
            int counter = 0;

            while (counter < st.length()) {
                boolean allPass = true;
                for (int i = 0; i < st.length() - counter; i++) {
                    if (st.charAt(j) != reversedString.charAt(i)) {
                        allPass = false;
                        counter++;
                        break;
                    }
                    j++;
                }
                j = counter;
                if (allPass) {
                    break;
                }
            }
            st = st + reversedString.substring(reversedString.length() - counter);

        }
        return st;
    }

}
