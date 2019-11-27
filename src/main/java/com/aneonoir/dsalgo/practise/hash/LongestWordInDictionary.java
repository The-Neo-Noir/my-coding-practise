package com.aneonoir.dsalgo.practise.hash;

import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/longest-word-in-dictionary/
 * <p>
 * failed Case:
 * TODO:
 */
public class LongestWordInDictionary {

    public static void main(String[] args) {

        LongestWordInDictionary longestWordInDictionary = new LongestWordInDictionary();
        // String s = longestWordInDictionary.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "applz", "apple"
        String s = longestWordInDictionary.longestWord(new String[]{"yo", "ew", "fc", "zrc", "yodn", "fcm", "qm", "qmo", "fcmz", "z", "ewq", "yod", "ewqz", "y"});
        // String s = longestWordInDictionary.longestWord(new String[]{"w","wo","wor","worl", "world"});

        System.out.println(s);
    }

    public String longestWord(String[] words) {
        TreeMap<String, Boolean> map = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            String key = words[i].substring(0, words[i].length() - 1);
            if (map.containsKey(key))
                map.put(words[i], true);
            else
                map.put(words[i], false);
        }
        String max = "";
        int maxLength = 0;
        for (String s : map.keySet()) {
            Boolean aBoolean = map.get(s);

            if (aBoolean && maxLength < s.length()) {
                max = s;
                maxLength = s.length();
            }

        }
        return max;
    }
}
