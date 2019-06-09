package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/jewels-and-stones/
 * <p>
 * TODO: Can you do it without hashing ? Hint by using only string functions
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(S.charAt(i) + "")) {
                if (map.containsKey(S.charAt(i))) {
                    map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
                } else {
                    map.put(S.charAt(i), 1);
                }
            }
        }
        return map.values().stream().reduce(0, (integer, integer2) -> integer + integer2).intValue();
    }
}
