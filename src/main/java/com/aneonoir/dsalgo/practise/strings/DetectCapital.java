package com.aneonoir.dsalgo.practise.strings;

/**
 * Detect Capital
 * link: https://leetcode.com/problems/detect-capital/discuss/99298/Java-1-Liner
 * <p>
 * Easy, solved , but can you do less code, can you merge so many if else into smaller footprint in code.
 * <p>
 * See some of the ways how are they are solving it. And wrote so much code .
 * tag: interview, regex,string,
 *
 * TODO: write concise code, use regex may be .
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        int upperCaseC = 0;
        int lowerCaseC = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCaseC++;
            } else {
                lowerCaseC++;
            }
        }
        if (Character.isUpperCase(word.charAt(0))) {
            if (upperCaseC == word.length()) {
                return true;
            } else return lowerCaseC == word.length() - 1;
        } else {
            return lowerCaseC == word.length();
        }
    }
}
