package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * link:https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 * <p>
 * solution: approach, do a level order traversal , add the sum and level in  a wrapper, and add that to treemap
 * <p>
 * struggle: DO a good bit of comparable and comparator.
 * <p>
 * tag: level order traversal, node sum , tree, comparable, comparator, equals and hashcode.
 */
public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        if (root != null) {
            List<TreeNode> list = new LinkedList<>();
            list.add(root);
            TreeMap<Wrapper, Integer> map = new TreeMap<>();
            level(list, map, 1);
            return map.firstKey().level;
        } else {
            return -1;
        }
    }

    private void level(List<TreeNode> list, TreeMap<Wrapper, Integer> map, int level) {
        if (list.size() > 0) {
            int sum = 0;
            List<TreeNode> local = new LinkedList<>();
            for (TreeNode node : list) {
                sum += node.val;
                if (node.left != null) local.add(node.left);
                if (node.right != null) local.add(node.right);
            }
            map.put(new Wrapper(level, sum), level);
            level(local, map, level + 1);
        }
    }

    class Wrapper implements Comparable<Wrapper> {
        int level;
        int sum;

        Wrapper(int level, int sum) {
            this.level = level;
            this.sum = sum;
        }

        public int compareTo(Wrapper obj) {
            if (this.sum == obj.sum) {
                return this.level - obj.level;
            } else {
                return obj.sum - this.sum;
            }
        }

        public boolean equals(Object obj) {
            Wrapper wo = (Wrapper) obj;
            return wo.level == this.level;
        }

        public int hashCode() {
            return this.level;
        }
    }
}
