package com.aneonoir.dsalgo.practise.strings;

import static junit.framework.TestCase.assertEquals;

/**
 * link: https://leetcode.com/problems/implement-strstr/submissions/
 * <p>
 * approach: naive, should there any better approach >
 * <p>
 * tag: string, needle in the haystack, interview,
 * <p>
 * TODO : see if there is any better way to do this.
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        assertEquals(2, strStr("hello", "ll"));

        assertEquals(-1, strStr("hello", ""));
        assertEquals(2, strStr("hello", "l"));
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
