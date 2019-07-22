package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/sum-of-leaf-nodes/1
 * <p>
 * apporach: solved it using recursion
 * TODO: can you solve it using non-recursion ?
 */
public class SumOfLeafNodes {
    public int SumofLeafNodes(Node root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return root.data;
            }
            return SumofLeafNodes(root.left) + SumofLeafNodes(root.right);
        } else {
            return 0;
        }
    }
}
