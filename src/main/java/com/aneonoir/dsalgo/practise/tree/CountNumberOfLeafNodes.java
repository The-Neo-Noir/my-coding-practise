package com.aneonoir.dsalgo.practise.tree;

/**
 * link:  https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
 * <p>
 * <p>
 * TODO: iteratively
 * tag: interview,tree,leaf count
 */
public class CountNumberOfLeafNodes {
    int countLeaves(Node node) {
        return countLeavesR(node);
    }

    int countLeavesR(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                return 1;
            }
            return countLeavesR(node.left) + countLeavesR(node.right);
        } else {
            return 0;
        }
    }
}
