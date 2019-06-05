package com.aneonoir.dsalgo.practise.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * <p>
 * Struggle: If you think adding letters togather can be a good hashcode think again.
 * and THINK AGAIN, I KNOW WHEN IT WOULD BE BREAKING CAN YOU THINK ?
 * <p>
 * Strugle2: anagram gonna give you trouble .
 * <p>
 * TODO: THIS IS A MUST DO .
 */
public class FindAllAnagramsInAString {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        assertEquals(Arrays.asList(0, 1, 2), findAnagrams("abab", "ab"));
        assertEquals(Arrays.asList(), findAnagrams("ab", "cd"));
        assertEquals(Arrays.asList(), findAnagrams("af", "be"));
        assertEquals(Arrays.asList(1), findAnagrams("baa", "aa"));
        assertEquals(Arrays.asList(0, 6), findAnagrams("cbaebabacd", "abc"));
        assertEquals(Arrays.asList(0, 2, 4, 6), findAnagrams(
                "ababababab", "aab"));


    }

    public List<Integer> findAnagrams(String tar, String arg) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= tar.length() - arg.length(); i++) {
            if (reduce(tar.substring(i, i + arg.length()), arg)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean reduce(String substring, String sub) {
        HashMap<Character, Integer> source = new HashMap<>();
        HashMap<Character, Integer> target = new HashMap<>();

        for (int i = 0; i < sub.length(); i++) {
            if (source.containsKey(sub.charAt(i))) {
                source.put(sub.charAt(i), source.get(sub.charAt(i) + 1));
            } else {
                source.put(sub.charAt(i), 1);
            }
        }
        for (int i = 0; i < substring.length(); i++) {
            if (target.containsKey(substring.charAt(i))) {
                target.put(substring.charAt(i), target.get(substring.charAt(i) + 1));
            } else {
                target.put(substring.charAt(i), 1);
            }
        }
        return source.equals(target);
    }
}
