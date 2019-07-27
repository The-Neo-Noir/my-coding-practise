package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/validate-binary-search-tree/solution/
 * <p>
 * approach: started with recursion approach, with lots of twist and turn, but still a lot of problem
 * <p>
 * TODO: a must todo a lot of time.
 */
public class ISBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(98);
        root.left = new TreeNode(-57);
        root.right = null;
        root.left.right = new TreeNode(58);
        root.left.right.left = new TreeNode(31);
        ISBinaryTree isBinaryTree = new ISBinaryTree();
        System.out.println(isBinaryTree.isValidBST(root));

    }

    public boolean isValidBST(TreeNode root) {

        if (root != null) {
            return leftValidate(root.left, root) && rightValidate(root.right, root);
        } else {
            return false;
        }
    }

    private boolean rightValidate(TreeNode root, TreeNode parent) {
        if (root != null) {
            boolean val = parent.val < root.val;
            if (root.left != null) {
                val &= (root.left.val < root.val);
            }
            if (root.right != null) {
                val &= (root.right.val > root.val);
            }

            return val && rightValidate(root.left, parent) && rightValidate(root.right, parent);
        } else {
            return true;
        }
    }

    private boolean leftValidate(TreeNode root, TreeNode parent) {
        if (root != null) {
            boolean val = parent.val > root.val;
            if (root.left != null) {
                val &= (root.left.val < root.val);
            }
            if (root.right != null) {
                val &= (root.right.val > root.val);
            }

            return val && leftValidate(root.left, parent) && leftValidate(root.right, parent);
        } else {
            return true;
        }
    }
}