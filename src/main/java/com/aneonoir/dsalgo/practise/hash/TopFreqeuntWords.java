package com.aneonoir.dsalgo.practise.hash;

import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

//TOOD:
public class TopFreqeuntWords {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue p = new PriorityQueue();
        // TODO:
        return null;
    }
}
