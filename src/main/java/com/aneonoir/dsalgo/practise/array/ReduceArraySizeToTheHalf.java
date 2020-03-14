package com.aneonoir.dsalgo.practise.array;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * link: https://leetcode.com/problems/reduce-array-size-to-the-half/
 *
 * todo: I followed the hint and solved it.
 *
 * tag: array, hashmap, greedy , heap
 */
public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer in : arr) {
            map.put(in, map.getOrDefault(in, 0) + 1);
        }
        PriorityQueue<Wrap> que = new PriorityQueue<>();
        for (Integer in : map.keySet()) {
            que.add(new Wrap(in, map.get(in)));
        }
        int count = 0;
        int c = 0;
        while (count < arr.length / 2) {
            count += que.remove().freq;
            c++;
        }
        return c;
    }

    class Wrap implements Comparable<Wrap> {
        Integer value;
        Integer freq;

        Wrap(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        public int compareTo(Wrap that) {
            return that.freq.compareTo(this.freq);
        }
    }

}