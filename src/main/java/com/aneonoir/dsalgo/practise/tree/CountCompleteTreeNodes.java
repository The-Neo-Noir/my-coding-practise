package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/count-complete-tree-nodes/
 * <p>
 * I misunderstood, complete trree, I implemented something wrong, gave wrong answer.
 * SO just implemented to count the nodes.
 * why can't we just have the count the tree ?
 * TODO: how others have done.
 * tag: interview, tree , complete tree
 */
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countRightTree(root);

    }

    //    private int countLevel(TreeNode root){
//        if(root!=null){
//            return 1+countLevel(root.left);
//        }else{
//            return 0;
//        }
//    }
    private int countRightTree(TreeNode root) {
        if (root != null) {
            return 1 + countRightTree(root.left) + countRightTree(root.right);
        } else {
            return 0;
        }
    }
}
