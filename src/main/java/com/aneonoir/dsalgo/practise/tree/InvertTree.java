package com.aneonoir.dsalgo.practise.tree;

/**
 * link:
 * TODO: can you do it iteratively  ?
 * <p>
 * Runtime: Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 * Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
 * Next challenges:
 * <p>
 * tags:binary tree, interview, invert the tree. rucursive.
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invertTreeRecursive(root);
        }
        return root;
    }

    private void invertTreeRecursive(TreeNode root) {
        if (root.left == null && root.right == null) {
            return;
        } else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            if (root.left != null) invertTreeRecursive(root.left);
            if (root.right != null) invertTreeRecursive(root.right);
        }
    }
}
