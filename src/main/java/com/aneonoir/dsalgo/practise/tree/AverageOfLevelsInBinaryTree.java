package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * <p>
 * approach : used an iterative approach in solving it.
 * Solved using two nested loops using iterative method,
 * Slow : Runtime: 3 ms, faster than 26.58% of Java online submissions for Average of Levels in Binary Tree.
 * Memory Usage: 41.5 MB, less than 36.00% of Java online submissions for Average of Levels in Binary Tree.
 * can you make it fast ? "
 * <p>
 * TODO: DO It again, with recursive appraoch .
 * tag: interview, tree, bfs
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<Double> result = new LinkedList<>();

        if (root != null) {
            que.add(root);
        }
        while (!que.isEmpty()) {
            List<TreeNode> d = new ArrayList<>();
            double sum = 0;
            while (!que.isEmpty()) {
                TreeNode cur = que.remove();
                d.add(cur);
                sum += cur.val;
            }
            result.add(sum / d.size());

            for (TreeNode eme : d) {
                if (eme.left != null) que.add(eme.left);
                if (eme.right != null) que.add(eme.right);
            }
        }
        return result;
    }
}
