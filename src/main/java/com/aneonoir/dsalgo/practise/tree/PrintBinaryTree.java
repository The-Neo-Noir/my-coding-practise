package com.aneonoir.dsalgo.practise.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/print-binary-tree/submissions/
 *
 * approach: Know the hight  and build the list with blanks. and recursively find the location of the element in the list and replace the value.
 *
 *
 * Runtime: 5 ms, faster than 20.14% of Java online submissions for Print Binary Tree.
 *
 * TODO: Could be improved. Do iteratively ,
 *
 * tag: interview, practise, tree, list , recursion, binary tree.
 *
 * Related:
 * 1. Unique Binary Search Trees ( https://leetcode.com/problems/unique-binary-search-trees/)
 * 2. Maximum Binary Tree II ( https://leetcode.com/problems/maximum-binary-tree-ii/ )
 * 3. Maximum Product of Splitted Binary Tree ( https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/ )
 *
 */
public class PrintBinaryTree {
    public static void main(String[] args) {
        PrintBinaryTree printBinaryTree = new PrintBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
          //  [1,2,5,null,3,5,null]
        root.right = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        printBinaryTree.printTree(root);

    }
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new LinkedList<>();
        if(root!=null){
            int height=getHeight(root,0);
            System.out.println(height);
            // TODO for one node.
            int noNodes=(int)Math.pow(2,height+1)-1;

            for(int i=0;i<=height;i++){
                LinkedList<String> local = new LinkedList<>();
                for(int j=0;j<noNodes;j++){
                    local.add("");
                }
                result.add(local);

            }
            recurs(root,result,null,0,height,0,result.get(0).size()-1);
        }
        return result;
    }
    private void re(List<TreeNode> list, List<List<String>> result,int level){
        List<TreeNode> toPass = new LinkedList<>();
        for (TreeNode treeNode : list) {

        }
    }

    private void recurs(TreeNode root,List<List<String>> result, List<String> part,int so,int height, int low, int high ){

        if(root!=null){

            List<String> local=null;
            int index=0;
            if(part==null){
                local = result.get(so);
            }else{
                local=part;
            }
            index=low+(high-low)/2;

            local.set(index,root.val+"");
            if(so<height){
                List<String> strings = result.get(so + 1);
                recurs(root.left,result, strings,               so+1,height,low,index-1);
                recurs(root.right,result,strings,so+1,height,index+1,high);
            }

        }
    }

    private int getHeight(TreeNode root, int height){
        if(root!=null){
            return Math.max(getHeight(root.left,height+1),getHeight(root.right,height+1));
        }else{
            return height-1;
        }
    }
}
