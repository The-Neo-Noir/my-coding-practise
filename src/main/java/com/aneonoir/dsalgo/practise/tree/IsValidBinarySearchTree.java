package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 * <p>
 * first attempt: failed 7 test cases
 */
public class IsValidBinarySearchTree {


    boolean checkBST(Node root) {

        if (root != null) {
            boolean result = true;
            if (root.left != null) {
                result &= (root.data >= root.left.data) & checkBST(root.left);
            }
            if (root.right != null) {
                result &= (root.data < root.right.data) & checkBST(root.right);
            }
            return result;
        } else {
            return true;
        }
    }

}
