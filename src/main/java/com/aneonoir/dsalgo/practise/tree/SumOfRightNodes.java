package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-of-right-leaf-nodes/1
 * <p>
 * approach: recursive, but traversing each node, and knowing which side do the node falls.
 * approach: TODO: traverse only the root, and add only the right if its leaf node.
 * approach: TODO: iteratively .
 * <p>
 * tag: interview, tree,
 */
public class SumOfRightNodes {

    public int rightLeafSum(Node root, String phase) {
        if (root != null) {
            if (root.right == null && root.left == null) {
                if (phase.equals("right")) {
                    return root.data;
                } else {
                    return 0;
                }
            } else {
                return rightLeafSum(root.left, "left") + rightLeafSum(root.right, "right");
            }
        } else {
            return 0;
        }
    }

    public int rightLeafSum(Node root) {
        return rightLeafSum(root, "");
    }
}
