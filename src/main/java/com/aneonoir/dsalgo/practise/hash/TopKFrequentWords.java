package com.aneonoir.dsalgo.practise.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * link: https://leetcode.com/problems/top-k-frequent-words/
 * <p>
 * approach: used hashing mostly.
 * <p>
 * tag:
 * TODO: appearnly it can be done in differnt ways, with better time complexity , see in the question.
 * <p>
 * TODO: Also turns out that I have not understood the priority queue correctly, need to explore and do  .
 * <p>
 * TODO: understand the differnce between lexicographically and alphabetically , java string are lexicographically implmemented.
 */
public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        TreeSet<CustomSorter> qu = new TreeSet<>();
        for (String str : map.keySet()) {
            qu.add(new CustomSorter(str, map.get(str)));
        }
        List<String> result = new ArrayList<>(k);
        int count = 1;
        for (CustomSorter son : qu) {
            if (count <= k)
                result.add(son.str);
            count++;
        }
        return result;
    }

    class CustomSorter implements Comparable<CustomSorter> {
        String str;
        int priority;

        CustomSorter(String str, int priority) {
            this.str = str;
            this.priority = priority;
        }

        public int compareTo(CustomSorter sort) {
            if (this.priority == sort.priority) {
                return this.str.compareTo(sort.str);
            } else {
                return sort.priority - this.priority;
            }
        }
    }
}
