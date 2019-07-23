package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 * <p>
 * approach: a recursive approach is good, but I am struggling a lot .
 */
public class BSTGreaterSumTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(4);
        bstToGst(treeNode);
        System.out.println(treeNode);
    }

    public static TreeNode bstToGst(TreeNode root) {
        TreeNode temp = root;
        calculateTotal(root);
        return temp;

    }

    static int calculateTotal(TreeNode node) {
        if (node != null) {
            return calculateTotal(node.right) + node.val;
        } else {
            return 0;
        }
    }
}