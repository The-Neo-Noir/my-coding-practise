package com.aneonoir.dsalgo.practise.hash;

import java.util.LinkedHashMap;

/**
 * link: https://leetcode.com/problems/first-unique-character-in-a-string/
 * <p>
 * approach: https://leetcode.com/problems/first-unique-character-in-a-string/
 * <p>
 * Runtime: 33 ms, faster than 54.77% of Java online submissions for First Unique Character in a String.
 * <p>
 * TODO:
 * tag: hash,interview
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, CountAndIndex> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                CountAndIndex cntind = map.get(s.charAt(i));
                cntind.count = cntind.count + 1;
            } else {
                map.put(s.charAt(i), new CountAndIndex(1, i));
            }
        }
        int result = -1;
        System.out.println(map.values());
        for (CountAndIndex c : map.values()) {
            if (c.count == 1) {
                result = c.index;
                break;
            }
        }
        return result;
    }

    class CountAndIndex {
        int index;
        int count;

        CountAndIndex(int count, int index) {
            this.count = count;
            this.index = index;
        }

        public String toString() {
            return "{" + count + "," + index + "}";
        }
    }
}
