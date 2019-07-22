package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
 * <p>
 * approach: used a Bst approach , using a queue non recursive.
 * <p>
 * struggle: is at line 40 ,
 */
public class FindLargestElementInEachRow {
    public List<Integer> largestValues(TreeNode root) {
        Queue<List<TreeNode>> queue = new ArrayDeque<>();
        List<Integer> result = new LinkedList<>();
        if (root != null) {
            List<TreeNode> l = new LinkedList<TreeNode>();
            l.add(root);
            queue.add(l);
        }

        while (queue.size() > 0) {
            List<TreeNode> levelEles = queue.poll();
            // System.out.println(levelEles);
            result.add(findMax(levelEles));
            List<TreeNode> nextLevel = new LinkedList<>();
            for (int i = 0; i < levelEles.size(); i++) {
                TreeNode node = levelEles.get(i);

                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            if (nextLevel.size() > 0) {
                queue.add(nextLevel);
            }

        }
        return result;
    }

    public Integer findMax(List<TreeNode> nodes) {
        int max = nodes.get(0).val;
        for (int i = 1; i < nodes.size(); i++) {
            if (max < nodes.get(i).val) {
                max = nodes.get(i).val;
            }
        }
        return max;
    }
}