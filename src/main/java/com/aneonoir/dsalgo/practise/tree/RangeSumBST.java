package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/range-sum-of-bst/submissions/
 * <p>
 * approach: Used a global variable and a inorder traversal to solve it
 * <p>
 * TODO: Can  you do it recursively without using a global varaible?
 * TODO: can you solve it using non-recursive as parameter passing ?
 * TODO: can  you solveit using tail recursion ?
 */
public class RangeSumBST {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        traverse(root, L, R);
        return sum;
    }

    public void traverse(TreeNode root, int L, int R) {
        if (root != null) {
            traverse(root.left, L, R);
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            traverse(root.right, L, R);
        }
    }


}
