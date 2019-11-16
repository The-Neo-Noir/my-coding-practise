package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/inorder-traversal/1
 *
 * approach: solved using recursion
 *
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
