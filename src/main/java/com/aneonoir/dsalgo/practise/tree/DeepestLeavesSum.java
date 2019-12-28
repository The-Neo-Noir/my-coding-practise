package com.aneonoir.dsalgo.practise.tree;

import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/deepest-leaves-sum/
 * <p>
 * approach: used a treemap  to hold all the leaves , and the  last key will be containing the data.
 * <p>
 * TODO: see how other are doing it .
 * <p>
 * tag: map,tree, leaves , deepest level .
 */
public class DeepestLeavesSum {


    public int deepestLeavesSum(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        deepestLeavesSum(root, map, 0);
        return map.get(map.lastKey());
    }

    private void deepestLeavesSum(TreeNode root, TreeMap<Integer, Integer> map, int level) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                if (map.containsKey(level)) {
                    map.put(level, map.get(level) + root.val);
                } else {
                    map.put(level, root.val);
                }
            }
            deepestLeavesSum(root.left, map, level + 1);
            deepestLeavesSum(root.right, map, level + 1);
        }
    }
}