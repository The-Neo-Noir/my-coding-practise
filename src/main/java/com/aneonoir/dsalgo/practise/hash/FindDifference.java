package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * link: https://leetcode.com/problems/find-the-difference/submissions/
 * <p>
 * approach 1: failed test case, i added the s to the hashset, and if not found while traverseing the second string then that s answer,
 * approach 2: used two hash map worked.
 * TODO: but there could be faster machanism
 */
public class FindDifference {
    public static void main(String[] args) {
        assertEquals('a', findTheDifference("abcd", "aabcd"));
        assertEquals('a', findTheDifference("abcd", "abcda"));
        assertEquals('e', findTheDifference("aabbcd", "aabbcde"));

    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> set = new HashMap<>();
        Map<Character, Integer> tet = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.containsKey(s.charAt(i))) {
                set.put(s.charAt(i), set.get(s.charAt(i)) + 1);
            } else {
                set.put(s.charAt(i), 1);
            }
        }

        char result = ' ';

        for (int i = 0; i < t.length(); i++) {
            if (!set.containsKey(t.charAt(i))) {
                result = t.charAt(i);
            } else {
                if (tet.containsKey(t.charAt(i))) {
                    tet.put(t.charAt(i), tet.get(t.charAt(i)) + 1);
                } else {
                    tet.put(t.charAt(i), 1);
                }
            }

        }
        if (result == ' ') {
            for (Character c : set.keySet()) {
                if (set.get(c) != tet.get(c)) {
                    result = c;
                    break;
                }
            }

        }
        return result;
    }
}