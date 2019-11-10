package com.aneonoir.dsalgo.practise.tree;
/**
 * link: https://leetcode.com/problems/find-bottom-left-tree-value/
 * approach: solved using iterative method,
 * TODO: can you do it using recursion ?
 * tags: tree,binary tree,traversal,interview
 */

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        int result = 0;
        while (!que.isEmpty()) {
            TreeNode current = que.remove();
            result = current.val;
            if (current.right != null) que.add(current.right);
            if (current.left != null) que.add(current.left);
        }
        return result;
    }
}
