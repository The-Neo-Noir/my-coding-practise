package com.aneonoir.dsalgo.practise.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * link: https://leetcode.com/problems/group-anagrams/
 *
 * todo: looks like its slow, can be done faster by using bitwise, can you find out how >
 *
 * tag: medium , string, hashmap, bitwise
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> maps = new HashMap<>();
        for (String str : strs) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (Character ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            if (maps.containsKey(map)) {
                maps.get(map).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                maps.put(map, list);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for (List<String> lists : maps.values()) {
            list.add(lists);
        }
        return list;
    }

}
