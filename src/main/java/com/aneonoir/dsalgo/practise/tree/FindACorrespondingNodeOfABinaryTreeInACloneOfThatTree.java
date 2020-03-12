package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * link: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 *
 * todo: a follow up , what if there are duplicates in the tree
 *
 *
 * todo:  9 ms, faster than 25.00% of Java online submissions for Find a Corresponding Node of a Binary Tree in a Clone of That Tree.
 *
 * tag: tree,bfs,interview
 */
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        int index=tracePath(original,target);
        return findNode(cloned,index);
    }

    private final TreeNode findNode(TreeNode node, int index){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(node);
        int lo=0;
        TreeNode result=null;
        while(lo<=index){
            TreeNode n= q.remove();
            result=n;
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
            lo++;
        }
        return result;
    }


    private final int tracePath(TreeNode original, TreeNode target){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(original);
        int index=0;
        while(!q.isEmpty()){
            TreeNode n= q.remove();
            if(n.val==target.val){
                break;
            }
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
            index++;
        }
        return index;
    }
}
