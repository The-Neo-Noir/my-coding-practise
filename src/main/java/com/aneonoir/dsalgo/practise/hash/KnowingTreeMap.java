package com.aneonoir.dsalgo.practise.hash;

import java.util.TreeMap;

public class KnowingTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, 1);
        }
        Integer integer = map.firstKey();
        System.out.println(integer);
        Integer integer1 = map.lastKey();
        System.out.println(integer1);
    }
}
