package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/sum-of-left-leaves/submissions/
 * <p>
 * approach: bfs , iterativeSolved it using bfs using queue, if you are at the left node and the left and right is null thus a leaf node add it to the sum
 * <p>
 * Can you do it  using recursion?
 * <p>
 * TODO:  recursively
 * tags: interview, tree, leaf nodes
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        int sum = 0;
        while (!que.isEmpty()) {
            TreeNode item = que.remove();
            if (item.left != null) {
                que.add(item.left);
                if (item.left.left == null && item.left.right == null) {
                    sum += item.left.val;
                }
            }
            if (item.right != null) {
                que.add(item.right);
            }
        }
        return sum;
    }
}
