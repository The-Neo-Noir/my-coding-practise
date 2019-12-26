package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1
 * <p>
 * approach:
 * tag: diagonal traversal , tree, interview.
 * TODO: iterative
 */
public class DiagonalTraversalOfBinaryTree {
    public void diagonalPrint(TreeNode root) {
        List<TreeNode> nodes = new LinkedList<>();
        if (root != null) {
            nodes.add(root);
            diagonalPrint(nodes);
        }
    }

    public void diagonalPrint(List<TreeNode> nodes) {
        if (nodes.size() > 0) {
            List<TreeNode> local = new LinkedList<>();
            for (TreeNode node : nodes) {
                while (node != null) {
                    System.out.print(node.val + " ");
                    if (node.left != null) local.add(node.left);
                    node = node.right;
                }
            }
            diagonalPrint(local);
        }

    }
}