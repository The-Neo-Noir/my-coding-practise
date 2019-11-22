package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * linK: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * <p>
 * approach: Solved using two hashmaps, can you improve it. Its very slow.
 * <p>
 * tag: interview,string,array, hashmap
 */
public class FindWordsThatCanBeFormedbyCharacters {

    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < chars.length(); i++) {
            if (map.containsKey(chars.charAt(i))) {
                map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
            } else {
                map.put(chars.charAt(i), 1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            boolean matched = true;
            HashMap<Character, Integer> localmap = new HashMap<>();
            for (int k = 0; k < words[i].length(); k++) {
                if (localmap.containsKey(words[i].charAt(k))) {
                    localmap.put(words[i].charAt(k), localmap.get(words[i].charAt(k)) + 1);
                } else {
                    localmap.put(words[i].charAt(k), 1);
                }
            }
            for (Character ch : localmap.keySet()) {
                if (map.containsKey(ch) && localmap.get(ch) <= map.get(ch)) {

                } else {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                sum += words[i].length();
            }
        }
        return sum;
    }
}