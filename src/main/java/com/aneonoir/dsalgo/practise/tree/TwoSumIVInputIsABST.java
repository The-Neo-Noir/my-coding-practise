package com.aneonoir.dsalgo.practise.tree;

import java.util.HashSet;

/**
 * link: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 *
 * follow up: can you do it without using recursion ?
 * follow up: can you do it without extra space ?
 * follow up: Lets use the recursion, and extra space, can you still improve it , hint its a binary tree ?
 *
 * struggle: two sum stratergy got it wrong.
 *
 * TODO:
 * tag: interview, tree, bst, two sum.
 *
 */
public class TwoSumIVInputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> st = new HashSet<>();
        if(root!=null){
            return findTarget(root,k,st);
        }
        return false;

    }
    private boolean findTarget(TreeNode node, int k , HashSet<Integer> ste){
        if(node!=null){
            if(ste.contains(node.val)){
                return true;
            }else{
                ste.add(k-node.val);
            }
            return findTarget(node.left,k,ste) || findTarget(node.right,k,ste);
        }else{
            return false;
        }
    }
}
