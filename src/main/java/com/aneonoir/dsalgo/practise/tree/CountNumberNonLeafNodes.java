package com.aneonoir.dsalgo.practise.tree;

/**
 * link:  https://practice.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1
 * <p>
 * approach: Pretty recursion, but struggle,
 * <p>
 * TODO: again
 * tag: tree, non-leaf node count, interview.
 */
public class CountNumberNonLeafNodes {
    int countNonLeafNodes(Node root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return 0;
            } else {
                return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
            }
        } else {
            return 0;
        }
    }
}
