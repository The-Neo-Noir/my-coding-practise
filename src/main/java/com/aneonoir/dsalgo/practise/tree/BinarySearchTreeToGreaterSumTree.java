package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 *
 * approach: a brain fuck recursion.
 * I could come up with the structure, but failed to do the answer,
 * see the differnece.
 * int calculateTotal(TreeNode node, int parent) {
 *         if (node != null) {
 *             node.val=node.val+calculateTotal(node.right, parent);
 *             return calculateTotal(node.left, node.val);
 *         } else {
 *             return 0;
 *         }
 *     }
 *
 *     TODO: can you do it iteratively ?
 *
 */
public class BinarySearchTreeToGreaterSumTree {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(2);
        t.right = new TreeNode(4);
        BinarySearchTreeToGreaterSumTree binarySearchTreeToGreaterSumTree = new BinarySearchTreeToGreaterSumTree();
        binarySearchTreeToGreaterSumTree.bstToGst(t);

    }
    public TreeNode bstToGst(TreeNode root) {
        calculateTotal(root,0);
        return root;

    }

    private int calculateTotal(TreeNode node, int parent) {
        if (node != null) {
            node.val=node.val+calculateTotal(node.right, parent);
            return calculateTotal(node.left, node.val);
        } else {
            return parent;
        }
    }
}