package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://practice.geeksforgeeks.org/problems/preorder-traversal/1/?ref=self
 *
 * TODO: can you solve it using iterative approach ?
 */
public class PreOrdertraversal {
    void preorder(Node root)
    {
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
