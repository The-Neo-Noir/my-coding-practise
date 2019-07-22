package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
 * <p>
 * apporach: used a recursion to solve it.
 * TODO: can you do it non-recursively ?
 */
public class CountNoOfLeafNodesBT {

    int countLeaves(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                return 1;
            }
            return countLeaves(node.left) + countLeaves(node.right);
        } else {
            return 0;
        }
    }
}
