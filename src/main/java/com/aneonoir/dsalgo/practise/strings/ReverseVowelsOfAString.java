package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/reverse-vowels-of-a-string/
 * <p>
 * TODO: still slower, can you use only one loop ??
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                sb.append(s.charAt(i) + "");
            }
        }
        sb.reverse();
        int counter = 0;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.append(sb.charAt(counter) + "");
                counter++;
            } else {
                result.append(s.charAt(i) + "");
            }
        }
        return result.toString();
    }

    private boolean isVowel(char c) {
        return Character.toLowerCase(c) == 'a' ||
                Character.toLowerCase(c) == 'e' ||
                Character.toLowerCase(c) == 'i' ||
                Character.toLowerCase(c) == 'o' ||
                Character.toLowerCase(c) == 'u';
    }
}
