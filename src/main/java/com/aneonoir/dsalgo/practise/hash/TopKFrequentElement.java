package com.aneonoir.dsalgo.practise.hash;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/top-k-frequent-elements/submissions/
 * Used two map and a custom sorter to do this, I have to explorr the impact of  LInkedHashMap, Comprable, equals , hashcode.
 *
 * TODO: a must practise, the follow up question is to solve it using o(nlogn) , which will be defintely faster.
 *
 *
 * tag: heap sort, comparable, treemap, custom sorter, interview.
 */
public class TopKFrequentElement {
    public static void main(String[] args) {

        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
        topKFrequentElement.topKFrequent(new int[]{1, 1, 2, 2}, 2);
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        TreeMap<Sorter, Integer> stored = new TreeMap();
        for (Integer num : map.keySet()) {
            Sorter sc = new Sorter(map.get(num), num);
            stored.put(sc, num);
        }
        List<Integer> list = new ArrayList<>(k);
        int i = 0;
        for (Sorter num : stored.keySet()) {
            if (i < k) {
                list.add(stored.get(num));
            }
            i++;
        }
        return list;
    }

    class Sorter implements Comparable<Sorter> {
        int weight;
        int key;

        Sorter(int weight, int key) {
            this.weight = weight;
            this.key = key;
        }

        public int compareTo(Sorter that) {
            if (that.weight == this.weight) {
                return this.key - that.key;
            } else {
                return that.weight - this.weight;
            }
        }

        public boolean equals(Object o) {
            if (o instanceof Sorter) {
                if (o == null) return false;
                Sorter s = (Sorter) o;

                if (s.weight == this.weight) {
                    if (s.key == this.key) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public int hashCode() {
            return (this.weight + "#" + this.key).hashCode();
        }
    }
}