package com.aneonoir.dsalgo.practise.tree;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * <p>
 * I have to try it out to clear my undertaning of recursion
 * <p>
 * TODO:
 */
public class LowestCommonAncesstorOfABinaryTree {


    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        t.left.right = new TreeNode(5);
        recure(t, t.left.right, t.right);
    }

    private static boolean recure(TreeNode t, TreeNode right, TreeNode right1) {
        if (t == null) {
            return false;
        } else {
            if (t == right) {
                return true;
            }
            return t == right1;


        }
    }
}
