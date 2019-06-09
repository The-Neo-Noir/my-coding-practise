package com.aneonoir.dsalgo.practise.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * link: https://app.codesignal.com/arcade/intro/level-12/s9qvXv4yTaWg8g4ma/solutions
 */
public class LongestString {

    String longestWord(String text) {

        String maxString = "";
        int max = 0;

        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            String current = m.group();
            if (max < current.length()) {
                max = current.length();
                maxString = current;
            }
        }
        return maxString;
    }

}
