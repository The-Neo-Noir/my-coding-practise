package com.aneonoir.dsalgo.practise.tree;

/**
 *
 * 01/01/20 1:21 PM
 * link: https://www.lintcode.com/problem/binary-tree-maximum-node/description
 *
 * Note: Java is pass by value,
 *
 * TODO: I just assigned a value in the max node, as in java its pass by value, assigning the max node to the passed argument,
 * is not possible how I am doing it.
 * can you do it the right way . Use the return type of the maxNode method,
 *
 *
 */
public class BinaryTreeMaximumNode {
    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        TreeNode max = null;
        if (root != null) {
            max = root;
            maxNode(root, max);
        }
        return max;
    }

    private void maxNode(TreeNode root, TreeNode maxNode) {
        if (root != null) {
            if (root.val > maxNode.val) {
                maxNode.val = root.val;
            }
            maxNode(root.left, maxNode);
            maxNode(root.right, maxNode);
        }
    }
}
