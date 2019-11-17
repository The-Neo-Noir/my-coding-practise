package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * link: https://leetcode.com/problems/word-pattern/
 * <p>
 * solution apporach 1: Solved it using a map, map keeps track of the key ( pattern key) and value holds the string.
 * <p>
 * Result: Runtime: 3 ms, faster than 14.50% of Java online submissions for Word Pattern.
 * Memory Usage: 34 MB, less than 97.30% of Java online submissions for Word Pattern.
 * <p>
 * Slow performance , perhaps due to the look up being done in the isAlreadyTaken,
 * <p>
 * Attempt one:  removed the value lookup , instead put in the hashset, but no still no performance improvment.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String stra[] = str.split("\\s");
        if (stra.length == pattern.length()) {
            Map<Character, String> map = new HashMap<>();
            HashSet<String> value = new HashSet<>();
            for (int i = 0; i < pattern.length(); i++) {
                if (map.containsKey(pattern.charAt(i))) {
                    String stored = map.get(pattern.charAt(i));
                    String current = stra[i];
                    if (!stored.equals(current)) {
                        return false;
                    }
                } else {
                    if (value.contains(stra[i])) {
                        return false;
                    } else {
                        value.add(stra[i]);
                        map.put(pattern.charAt(i), stra[i]);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean isAlreadytaken(Map<Character, String> map, String val) {
        for (String va : map.values()) {
            if (va.equals(val)) {
                return true;
            }
        }
        return false;
    }
}
