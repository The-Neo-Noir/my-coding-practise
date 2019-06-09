package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * link: https://app.codesignal.com/arcade/intro/level-9/AACpNbZANCkhHWNs3
 */
public class LongestDigitPrefix {

    @Test
    public void tes() {
        String regex = "2";
        assertTrue(regex.matches("\\d"));
        assertFalse("s2".matches(regex));
        String s = longestDigitsPrefix("1ss22332323");
        System.out.println(s);
    }

    String longestDigitsPrefix(String inputString) {

        String result = "";
        if (!(inputString.charAt(0) + "").matches("\\d")) {
            return result;
        }
        int counter = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inputString.length(); i++) {
            if ((inputString.charAt(i) + "").matches("\\d")) {
                sb.append(inputString.charAt(i) + "");
            } else {
                break;
            }

        }
        return sb.toString();
    }

}
