package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: leetcode
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            HashMap<Character, Integer> sm = new HashMap<>();
            HashMap<Character, Integer> tm = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (sm.containsKey(s.charAt(i))) {
                    sm.put(s.charAt(i), sm.get(s.charAt(i)) + 1);
                } else {
                    sm.put(s.charAt(i), 1);
                }
                if (tm.containsKey(t.charAt(i))) {
                    tm.put(t.charAt(i), tm.get(t.charAt(i)) + 1);
                } else {
                    tm.put(t.charAt(i), 1);
                }

            }
            return sm.equals(tm);
        }


    }
}
