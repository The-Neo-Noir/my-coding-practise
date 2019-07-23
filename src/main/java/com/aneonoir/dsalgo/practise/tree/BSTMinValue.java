package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1
 * <p>
 * approach: The idea is simple, traverse to the left most element.
 * Done it in recursive way, can you solve it iteratively ? TODO:
 */
public class BSTMinValue {
    int minValue(Node node) {
        if (node != null) {
            if (node.left == null) {
                return node.data;
            } else {
                return minValue(node.left);
            }
        } else {
            return -1;
        }
    }
}

