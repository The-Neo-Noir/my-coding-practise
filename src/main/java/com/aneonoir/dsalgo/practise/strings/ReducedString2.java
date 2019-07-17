package com.aneonoir.dsalgo.practise.strings;

import static org.junit.Assert.assertEquals;

/**
 * link:
 */
public class ReducedString2 {

    public static void main(String[] args) {
        assertEquals("", reducedString("12321"));
        assertEquals("", reducedString(""));
        assertEquals("2331", reducedString("123311"));

    }

    private static String reducedString(String inputString) {
        if (inputString != null && inputString.equals("")) {
            return "";
        } else {

            int fI = 0;
            int lI = inputString.length() - 1;

            while (fI < lI && inputString.charAt(fI) == inputString.charAt(lI)) {
                fI++;
                lI--;
            }
            if (fI == lI) {
                return "";
            }
            return inputString.substring(fI, lI + 1);
        }
    }


}
