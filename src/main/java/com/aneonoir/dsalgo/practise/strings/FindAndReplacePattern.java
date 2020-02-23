package com.aneonoir.dsalgo.practise.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;


public class FindAndReplacePattern {

    public static void main(String[] args) {
        FindAndReplacePattern findAndReplacePattern = new FindAndReplacePattern();
        findAndReplacePattern.findAndReplacePattern(new String[]{ "aqq", "dkd", "ccc", "eaa", "b", "a"}, "ab");
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> fdsulg = new ArrayList<>();
        LinkedHashMap<Character, Integer> mappattern = new LinkedHashMap<>();
        for (Character ch : pattern.toCharArray()) {
            mappattern.put(ch, mappattern.getOrDefault(ch, 0) + 1);
        }
        Integer a[] = mappattern.values().toArray(new Integer[mappattern.values().size()]);
        for (String word : words) {
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
            for (Character cs : word.toCharArray()) {
                map.put(cs, map.getOrDefault(cs, 0) + 1);
            }
            Integer b[] = map.values().toArray(new Integer[map.values().size()]);
            if (a.length <= b.length) {
                if (Arrays.equals(a, Arrays.copyOfRange(b, 0, a.length))) {
                    fdsulg.add(word);
                }
            }
        }
        return fdsulg;
    }
}
