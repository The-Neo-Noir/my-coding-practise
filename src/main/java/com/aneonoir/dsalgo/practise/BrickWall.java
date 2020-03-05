package com.aneonoir.dsalgo.practise;

import java.math.BigDecimal;
import java.util.*;

/**
 * TODO:
 */
public class BrickWall {
    public static void main(String[] args) {
        BrickWall brickWall = new BrickWall();
        List<List<Integer>> list = new LinkedList<>();
        list.add(Arrays.asList(1, 2, 2, 2));
        list.add(Arrays.asList(3, 1, 2, 1));
        list.add(Arrays.asList(1, 3, 2, 1));
        list.add(Arrays.asList(2, 3, 1, 1));
        list.add(Arrays.asList(3, 1, 2));
        list.add(Arrays.asList(1, 3, 1, 2));
        brickWall.leastBricks(list);
    }

    public int leastBricks(List<List<Integer>> wall) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        int col = 0;
        while (true) {
            int colVal = 0;
            int colBreak = 0;
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (List<Integer> list : wall) {
                if (col <= list.size() - 1) {
                    if (col == 0) {
                        colVal = list.get(col);
                    } else {
                        int val = list.get(col) + list.get(col - 1);
                        list.set(col, val);
                        colVal = list.get(col);
                    }

                    treeMap.put(colVal, treeMap.getOrDefault(colVal, 0) + 1);
                } else {
                    colBreak++;
                }
            }
            int maxFrequency = 0;
            for (Integer in : treeMap.keySet()) {
                if (maxFrequency < treeMap.get(in)) {
                    maxFrequency = treeMap.get(in);
                }
            }

            if (colBreak == wall.size()) {
                break;
            }
            map.put(col, maxFrequency);
            col++;
        }
        System.out.print(map);
        int maxFrequency = 0;
        int res = 1;
        boolean first = true;
        for (Integer in : map.keySet()) {
            if (first) {
                first = true;
                continue;
            }
            if (maxFrequency < map.get(in)) {
                maxFrequency = map.get(in);
                res = in;
            }
        }
        System.out.println(res + 1);
        return res + 1;

    }
}