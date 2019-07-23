package com.aneonoir.dsalgo.practise.strings;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/occurrences-after-bigram/
 * <p>
 * approach: the question was listed in hash table , so I could not think of this as hash table , but later
 * after the hint i solved it using regular sting.
 */
public class OccurancesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {
        String split[] = text.split("\\s+");
        List<String> result = new LinkedList<>();

        for (int i = 0; i < split.length - 2; i++) {
            if (split[i].equals(first) && split[i + 1].equals(second)) {
                result.add(split[i + 2]);
            }
        }
        String[] a = new String[result.size()];
        return result.toArray(a);
    }
}