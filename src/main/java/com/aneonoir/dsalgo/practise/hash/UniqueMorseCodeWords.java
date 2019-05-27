package com.aneonoir.dsalgo.practise.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * link: https://leetcode.com/problems/unique-morse-code-words/
 * <p>
 * <p>
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String source[] = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuffer temp = new StringBuffer();
            for (int j = 0; j < words[i].length(); j++) {
                temp.append(source[words[i].charAt(j) - 97]);
            }
            set.add(temp.toString());
        }
        return set.size();
    }
}
