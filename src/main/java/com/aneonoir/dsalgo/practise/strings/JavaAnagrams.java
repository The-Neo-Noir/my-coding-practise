package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * link: https://www.hackerrank.com/challenges/java-anagrams/submissions/code/54623658
 */
public class JavaAnagrams {


    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> mapA = new HashMap();
        Map<Character, Integer> mapB = new HashMap();

        if (a.length() != b.length()) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                Character cha = a.charAt(i);
                Character chb = b.charAt(i);
                if (mapA.containsKey(cha)) {
                    Integer intA = mapA.get(cha);
                    intA = intA + 1;
                    mapA.put(cha, intA);

                } else {
                    mapA.put(cha, 1);
                }

                if (mapB.containsKey(chb)) {
                    Integer intB = mapB.get(chb);
                    intB = intB + 1;
                    mapB.put(chb, intB);
                } else {
                    mapB.put(chb, 1);
                }

            }
            if (mapA.equals(mapB)) {
                return true;
            } else {
                return false;
            }
        }
    }


}