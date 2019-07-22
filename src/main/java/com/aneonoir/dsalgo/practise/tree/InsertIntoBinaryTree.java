package com.aneonoir.dsalgo.practise.tree;

/**
 * link: https://leetcode.com/problems/insert-into-a-binary-search-tree/
 *
 * approach: pretty easy, however there are multiple outcomes for given input.
 * TODO: I need to learn more about the kind of other possibilities
 */
public class InsertIntoBinaryTree{

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=root;
        if(root==null){
            return new TreeNode(val);
        }else{
            insertIntoBSTA(root,root,null,val);
        }

        return root;
    }
    private void    insertIntoBSTA(TreeNode root,TreeNode parent ,String dir,int val){
        if(root!=null){
            if(val>root.val){
                insertIntoBSTA(root.right,root,"right",val);
            }else{
                insertIntoBSTA(root.left,root,"left" ,val);
            }
        }else{
            if(dir!=null){
                if(dir.equals("left")){
                    parent.left=new TreeNode(val);
                }else{
                    parent.right=new TreeNode(val);
                }
            }
        }

    }
}