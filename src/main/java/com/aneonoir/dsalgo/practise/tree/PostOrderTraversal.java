package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/postorder-traversal/1/?ref=self
 * todo: solve it using iterative method;
 */
public class PostOrderTraversal {
    void postOrder(Node root) {
        if (root != null) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
