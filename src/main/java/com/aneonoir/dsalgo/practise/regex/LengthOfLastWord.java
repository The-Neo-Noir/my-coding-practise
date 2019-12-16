package com.aneonoir.dsalgo.practise.regex;

import java.util.regex.Pattern;

/**
 * link: https://leetcode.com/problems/length-of-last-word/
 * <p>
 * approach: used \\W and the last word in the length
 * <p>
 * TODO: can you do it without using regex ?
 * <p>
 * the runtime is pretty low.
 * Runtime: 6 ms, faster than 6.69% of Java online submissions for Length of Last Word.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        Pattern p = Pattern.compile("\\W");
        String ss[] = p.split(s);
        if (ss.length == 0) return 0;
        return ss[ss.length - 1].length();
    }
}
