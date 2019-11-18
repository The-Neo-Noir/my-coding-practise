package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * <p>
 * runtime: Runtime: 1 ms, faster than 97.86% of Java online submissions for Binary Tree Level Order Traversal II.
 * Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal II.
 * <p>
 * <p>
 * TODO: Can I even make it faster ?
 * <p>
 * <p>
 * LEARNINGS:
 * ((LinkedList<List<Integer>>) reverse).addFirst(inner); is valid
 * but converting the following is invalid
 * <p>
 * List<List<Integer>> sdf(){
 * LinkedList<LinkedList<Integer>> sdfsf= new LinkedList<>();
 * return (List<List<Integer>>) sdfsf; // invalid cast
 * <p>
 * <p>
 * <p>
 * approach :level order traversal .
 * <p>
 * tags: interview,bfs , binary tree,tree,
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        List<List<Integer>> reverse = new LinkedList<>();
        while (!que.isEmpty()) {
            List<TreeNode> list = new LinkedList<>();
            List<Integer> inner = new LinkedList<>();
            while (!que.isEmpty()) {
                TreeNode current = que.remove();
                list.add(current);
                inner.add(current.val);
            }
            for (TreeNode n : list) {
                if (n.left != null) que.add(n.left);
                if (n.right != null) que.add(n.right);
            }
            reverse.add(inner);

            ((LinkedList<List<Integer>>) reverse).addFirst(inner);
        }
        return reverse;
    }
}
