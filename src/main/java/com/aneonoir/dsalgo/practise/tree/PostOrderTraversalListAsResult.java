package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/
 *
 * approach: I used a recursive approach, but TODO: iterative approach .
 * Don't know why the iterative approach is marked as hard in leetcode.
 *
 * tag: tree, post order traversal, hard, interivew.
 * s
 */

public class PostOrderTraversalListAsResult {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list= new LinkedList<>();
        post(root,list);
        return list;
    }
    private void post(TreeNode root,List<Integer> list){
        if(root!=null){
            post(root.left,list);
            post(root.right,list);
            list.add(root.val);
        }
    }
}
