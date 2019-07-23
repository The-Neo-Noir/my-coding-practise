package com.aneonoir.dsalgo.practise.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/increasing-order-search-tree/submissions/
 */
public class IncreasingOrderSearchTree {
    List<Integer> nodes = new LinkedList<>();

    public TreeNode increasingBST(TreeNode root) {

        inorderTraversal(root);
        if (nodes.size() == 0) {
            return null;
        } else {
            return constructTree(nodes);
        }
    }

    void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            nodes.add(root.val);
            inorderTraversal(root.right);
        }
    }

    TreeNode constructTree(List<Integer> listNodes) {
        TreeNode root = new TreeNode(listNodes.get(0));
        TreeNode result = root;
        Iterator<Integer> itr = listNodes.iterator();
        for (int i = 1; i < listNodes.size(); i++) {
            root.left = null;
            root.right = new TreeNode(listNodes.get(i));
            root = root.right;

        }
        return result;
    }
}