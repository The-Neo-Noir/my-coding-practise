package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1
 * <p>
 * approach: I sometimes feel problems which involves recursion , the best way to deal with it is ,
 * how would you do a traversal,
 * <p>
 * tags: interview, practise
 * TODO: can you do it using iterative solution ?
 */
public class SizeOfBinaryTree {
    public static int size(TreeNode root) {
        if (root != null) {
            return size(root.left) + 1 + size(root.right);
        } else {
            return 0;
        }
    }
}
