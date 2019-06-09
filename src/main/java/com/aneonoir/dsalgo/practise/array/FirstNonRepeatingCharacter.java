package com.aneonoir.dsalgo.practise.array;

import java.util.HashMap;
import java.util.Map;

/**
 * link: https://app.codesignal.com/interview-practice/task/uX5iLwhc6L5ckSyNC
 */
public class FirstNonRepeatingCharacter {

    static char firstNotRepeatingCharacter(String s) {

        Map<Character, Integer> hashHolder = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashHolder.containsKey(s.charAt(i))) {
                hashHolder.put(s.charAt(i), hashHolder.get(s.charAt(i)) + 1);
            } else {
                hashHolder.put(s.charAt(i), 1);
            }
        }

        char ret = '_';

        for (Character c : hashHolder.keySet()) {
            if (hashHolder.get(c) == 1) {
                ret = c;
                break;
            }
        }

        return ret;
    }
}
