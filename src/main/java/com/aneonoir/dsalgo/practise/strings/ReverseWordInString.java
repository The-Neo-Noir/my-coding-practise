package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/reverse-words-in-a-string/
 * <p>
 * learing: : Note: \\W is word split, for example "This is" ==> ["This","is"]
 * How ever places where "THis      is" ==> ["THis    ", "is"]
 * <p>
 * \\w is for non word
 * <p>
 * Lets try with \\s+
 * <p>
 * TODO: can you do it inplace, if you were given a char []
 * <p>
 * tag: string,strinbuffer, reverse string.
 * <p>
 * Runtime: 6 ms, faster than 56.45% of Java online submissions for Reverse Words in a String.
 * I think it could have been faster.
 * <p>
 * Regex is notoriously slow.
 */
public class ReverseWordInString {

    public String reverseWords(String s) {
        if (s == null) {
            return "";
        }
        String split[] = s.split("\\s+");
        for (int i = 0; i < split.length / 2; i++) {
            String temp = split[i];
            split[i] = split[split.length - 1 - i];
            split[split.length - 1 - i] = temp;
        }
        StringBuffer sb = new StringBuffer();
        for (String sp : split) {
            sb.append(sp).append(" ");
        }
        return sb.toString().trim();
    }
}
