package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/mirror-tree/1
 * <p>
 * approach: solved using recursion
 * approach: can you solve it using iterative method.
 */
public class MirrorTree {

    void mirror(Node node) {
        if (node != null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
            mirror(node.left);
            mirror(node.right);
        }
    }

}
