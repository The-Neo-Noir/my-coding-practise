package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;
import java.util.TreeMap;

public class MissingNumber {
    static int[] missingNumbers(int[] arr, int[] brr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        TreeMap<Integer, Integer> brrMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer data = map.get(arr[i]);
                map.put(arr[i], data + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < brr.length; i++) {
            if (brrMap.containsKey(brr[i])) {
                Integer data = brrMap.get(brr[i]);
                brrMap.put(brr[i], data + 1);
            } else {
                brrMap.put(brr[i], 1);
            }
        }
        TreeMap<Integer, Integer> source = null;
        TreeMap<Integer, Integer> target;
        if (map.size() > brrMap.size()) {
            source = map;
            target = brrMap;
        } else {
            source = brrMap;
            target = map;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer key : source.keySet()) {
            if (target.containsKey(key)) {
                if (source.get(key) != target.get(key)) {
                    result.add(key);
                }
            } else {
                result.add(key);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i).intValue();
        }

        return resultArray;
    }
}
