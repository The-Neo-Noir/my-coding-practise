package com.aneonoir.dsalgo.practise.tree;

import java.util.TreeMap;

/**
 * link: https://practice.geeksforgeeks.org/problems/vertical-sum/1
 * <p>
 * approach: use weight for each node , -1 for left and +1 for right.
 * <p>
 * tag: vertical traversal , tree, interview,
 * <p>
 * TODO: can you do it iteratively  ?
 */
public class VerticalSum {
    public static void printVertical(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        printVertical(root, map, 0);
        for (Integer m : map.keySet()) {
            System.out.print(map.get(m) + " ");
        }
    }

    private static void printVertical(Node root, TreeMap<Integer, Integer> map, int weight) {
        if (root != null) {
            if (map.containsKey(weight)) {
                map.put(weight, map.get(weight) + root.data);
            } else {
                map.put(weight, root.data);
            }
            printVertical(root.left, map, weight - 1);
            printVertical(root.right, map, weight + 1);
        }
    }
}
