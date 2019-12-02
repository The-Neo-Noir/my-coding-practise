package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * <p>
 * TOOD: could not do it in the first attempt;
 */
public class FlattenBinaryTreeToLinkeList {
    public void flatten(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.right;
            if (root.left != null) {
                flatten(root.left);
                root.right = root.left;
                if (root.right != null) {
                    TreeNode last = root.left;
                    while (last.right != null) {
                        last = last.right;
                    }
                    last.right = temp;
                }
            }
            root.left = null;
        }

    }
}
