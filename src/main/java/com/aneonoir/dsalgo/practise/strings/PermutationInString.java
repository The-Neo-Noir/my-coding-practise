package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/permutation-in-string/
 * <p>
 * <p>
 * TODO:  slow performance to do with a better performance.
 * <p>
 * Approach: every permutation of the string will the same number of characters, using this as a hashmap , and s2 string can be iterated to retrive every consecutive elments and comapred with the hashmap.
 * <p>
 * Very slow performance.
 * <p>
 * Runtime: 486 ms, faster than 7.93% of Java online submissions for Permutation in String.
 * Memory Usage: 39.3 MB, less than 15.38% of Java online submissions for Permutation in String.
 * <p>
 * tags: interview,string , permutation, math.
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {

        int len = s1.length();
        boolean result = false;
        HashMap<Character, Integer> st = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            st.put(c, st.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i <= s2.length() - len; i++) {
            HashMap<Character, Integer> local = new HashMap<>();
            for (Character c : s2.substring(i, i + len).toCharArray()) {
                local.put(c, local.getOrDefault(c, 0) + 1);
            }
            if (local.equals(st)) {
                result = true;
                break;
            }
        }
        return result;
    }


}
