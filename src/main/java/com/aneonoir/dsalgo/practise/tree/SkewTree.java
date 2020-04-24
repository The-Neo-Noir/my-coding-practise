package com.aneonoir.dsalgo.practise.tree;

import java.util.Stack;

/**
 * link: https://www.lintcode.com/problem/increasing-order-search-tree/description
 *
 * approach: pretty straight forward , But I could not do it recursively , TODO:
 *
 * tag: easy , interivew,
 */
public class SkewTree {

    public TreeNode increasingBST(TreeNode root) {

        Stack<TreeNode> st= new Stack<>();
        TreeNode rptr=root;
        TreeNode result=null;
        TreeNode resultPtr=null;
        while(true){
            if(rptr==null){
                if(st.isEmpty()){
                    break;
                }else{
                    TreeNode node= st.pop();
                    if(result==null){
                        result=new TreeNode(node.val);
                        resultPtr=result;
                    }else{
                        TreeNode no=new TreeNode(node.val);
                        resultPtr.right=no;
                        resultPtr=resultPtr.right;
                    }
                    if(node.right!=null){
                        rptr=node.right;
                    }
                }
            }else{
                st.push(rptr);
                rptr=rptr.left;
            }
        }
        return result;
    }
}