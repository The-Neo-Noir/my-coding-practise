package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/univalued-binary-tree/submissions/
 * <p>
 * apporach: any travesal way will be fine
 * <p>
 * stuggle: stuggled a bit returning the value,
 */
public class UnivaluedTree {
    public boolean isUnivalTree(TreeNode root) {
        return val(root, root.val);
    }

    public boolean val(TreeNode root, int val) {
        if (root != null) {
            return val(root.left, val) && val(root.right, val) && root.val == val;
        } else {
            return true;
        }
    }
}
