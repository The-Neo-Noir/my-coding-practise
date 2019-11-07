package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1
 * tag: tree
 * level: easy
 */
public class SumOfBinaryTree {

    public int sumBT(Node root) {
        if (root == null) {
            return 0;
        } else {
            return sumBT(root.left) + root.data + sumBT(root.right);
        }
    }
}
