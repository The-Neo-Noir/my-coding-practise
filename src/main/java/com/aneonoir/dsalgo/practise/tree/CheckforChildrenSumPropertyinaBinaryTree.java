package com.aneonoir.dsalgo.practise.tree;

/**
 * Check for Children Sum Property in a Binary Tree
 * tags: intervie
 * <p>
 * TODO: prepare some test cases
 */
public class CheckforChildrenSumPropertyinaBinaryTree {


    public static void main(String[] args) {
        TreeNode t = new TreeNode(10);
        t.left = new TreeNode(8);
        t.right = new TreeNode(2);
        t.left.left = new TreeNode(3);

        t.right.left = new TreeNode(1);
        t.right.right = new TreeNode(1);

        if (t != null) {

            System.out.println(sumChec(t));
        }
    }

    private static boolean sumChec(TreeNode t) {
        if (t.left == null && t.right == null) {
            return true;
        } else {
            int lv = t.left == null ? 0 : t.left.val;
            int rv = t.right == null ? 0 : t.right.val;
            boolean val = lv + rv == t.val;

            if (t.left != null)
                val &= sumChec(t.left);

            if (t.right != null) {
                val &= sumChec(t.right);
            }
            return val;
        }
    }
}
