package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/
 * approach: use a queue to do it.
 * <p>
 * TODO: can it be done without using inner while loop
 */
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        while (!que.isEmpty()) {
            LinkedList<TreeNode> local = new LinkedList<>();
            LinkedList<Integer> sublist = new LinkedList<>();
            while (!que.isEmpty()) {
                local.add(que.remove());
            }

            for (TreeNode node : local) {
                sublist.add(node.val);
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }
            result.add(sublist);
        }
        return result;
    }
}
