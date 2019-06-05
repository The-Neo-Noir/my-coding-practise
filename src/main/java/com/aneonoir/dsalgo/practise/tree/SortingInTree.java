package com.aneonoir.dsalgo.practise.tree;

import java.util.Map;
import java.util.TreeMap;

/**
 * link: self
 * <p>
 * We are exploring the option of
 */
public class SortingInTree {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Sheena", 2);
        map.put("Abhiram", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        Map.Entry<String, Integer> abhiram = map.ceilingEntry("Abhiram");

    }
}
