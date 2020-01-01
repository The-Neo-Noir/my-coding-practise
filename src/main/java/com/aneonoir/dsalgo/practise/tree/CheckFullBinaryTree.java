package com.aneonoir.dsalgo.practise.tree;

/**
 * 01/01/20 , 2:35 PM
 *
 * link: https://www.lintcode.com/problem/check-full-binary-tree/description
 * approach: solved it using recursion ,
 *
 * TODO: can you do it using iteration ?
 *
 * tag: interview, tree, traversal, full binary tree
 *
 * struggle: make sure you dont' get into unreachable statements
 *
 *
 */
public class CheckFullBinaryTree {


    public boolean isFullTree(TreeNode root) {
        if(root!=null){
            boolean val =true;
            if(( root.left==null && root.right==null) || (root.left!=null && root.right!=null)  )
                val= true;
            else
                val= false;

            return val && isFullTree(root.left) && isFullTree(root.right);
        }else{
            return true;
        }
    }
}
