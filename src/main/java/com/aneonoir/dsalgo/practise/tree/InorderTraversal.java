package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/inorder-traversal/1
 *
 * approach: solved using recursion
 * TODO: can you do it using iterative approach
 */
public class InorderTraversal {
    void inOrder(Node root)
    {
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
}
