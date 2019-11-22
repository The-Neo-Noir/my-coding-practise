package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/merge-two-binary-trees/
 * <p>
 * Solved it using recursion, but the code is ugly.  and slow
 * <p>
 * Runtime: 1 ms, faster than 63.29% of Java online submissions for Merge Two Binary Trees.
 * Memory Usage: 39.9 MB, less than 100.00% of Java online submissions for Merge Two Binary Trees.
 * <p>
 * TODO: do it using iteration and do beautiful code
 * <p>
 * tags: tree,merge,recursion,interview questions
 */
public class MergeTwoTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = null;
        if (t1 == null && t2 == null) {
            return root;
        } else {
            int val1 = t1 == null ? 0 : t1.val;
            int val2 = t2 == null ? 0 : t2.val;
            root = new TreeNode(val1 + val2);
            TreeNode t1left = t1 == null ? null : t1.left;
            TreeNode t1right = t1 == null ? null : t1.right;

            TreeNode t2left = t2 == null ? null : t2.left;
            TreeNode t2right = t2 == null ? null : t2.right;

            merge(root, t1left, t2left, "left");
            merge(root, t1right, t2right, "right");
        }
        return root;
    }

    private void merge(TreeNode parent, TreeNode t1, TreeNode t2, String dir) {

        if (t1 == null && t2 == null) {
            return;
        } else {
            int val1 = t1 == null ? 0 : t1.val;
            int val2 = t2 == null ? 0 : t2.val;
            TreeNode node = new TreeNode(val1 + val2);
            if (dir.equals("left")) {
                parent.left = node;
            } else {
                parent.right = node;
            }
            TreeNode t1left = t1 == null ? null : t1.left;
            TreeNode t1right = t1 == null ? null : t1.right;

            TreeNode t2left = t2 == null ? null : t2.left;
            TreeNode t2right = t2 == null ? null : t2.right;

            merge(node, t1left, t2left, "left");
            merge(node, t1right, t2right, "right");
        }
    }
}
