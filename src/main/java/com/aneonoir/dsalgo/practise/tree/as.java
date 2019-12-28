package com.aneonoir.dsalgo.practise.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class as {
    public static void main(String[] args) {

        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);

        t.right = new TreeNode(3);
        as as = new as();
        as.widthOfBinaryTree(t);
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root != null) {
            que.add(root);
        }
        int level = 0;
        int maxWidth = 0;
        while (!que.isEmpty()) {
            List<TreeNode> list = new ArrayList<>((int) Math.pow(2, level));
            while (!que.isEmpty()) {
                list.add(que.remove());
            }

            int startIndex = 0, endIndex = 0;
            int counter = 0;
            boolean startSet = false;
            int nullCount = 0;
            for (TreeNode node : list) {
                if (node != null) {
                    que.add(node.left);
                    que.add(node.right);
                } else {
                    que.add(null);
                    que.add(null);
                }

                if (node == null) nullCount++;
                if (node != null) {
                    if (startSet == false) {
                        startIndex = counter;
                        startSet = true;
                    } else {
                        endIndex = counter;
                    }
                }
                counter++;
            }
            int localWidth = endIndex - startIndex + 1;
            if (localWidth > maxWidth) {
                maxWidth = localWidth;
            }
            if (nullCount == list.size()) {
                break;
            }
            level++;
        }

        return maxWidth;
    }
}
/*

    public int widthOfBinaryTreeRecursive(TreeNode root) {
        List<TreeNode>  lists = new LinkedList<>();
        if(root!=null){
            lists.add(root);
            return  widthOfBinaryTree(lists,0,0);
        }
        return 0;
    }

    public int widthOfBinaryTreeIterative(TreeNode root) {
        widthOfBinaryTree()

    }
    private int widthOfBinaryTree(TreeNode root){

        Queue<TreeNode> que = new LinkedList<>();
        if(root!=null){
            que.add(root);
        }
        int level=0;
        int maxWidth=0;
        while(!que.isEmpty()){
            List<TreeNode> list = new ArrayList<>((int)Math.pow(2, level));
            while(!que.isEmpty()){
                list.add(que.remove());
            }

            int startIndex=0,endIndex=0;
            int counter=0;
            boolean startSet=false;
            int nullCount=0;
            for(TreeNode node: list){
                if(node!=null){
                    que.add(node.left);
                    que.add(node.right);
                }else{
                    que.add(null);
                    que.add(null);
                }

                if(node==null) nullCount++;
                if(node!=null){
                    if(startSet==false){
                        startIndex=counter;
                        startSet=true;
                    }else{
                        endIndex=counter;
                    }
                }
                counter++;
            }
            int localWidth=endIndex-startIndex+1;
            if(localWidth>maxWidth){
                maxWidth=localWidth;
            }
        }


    }

    private int widthOfBinaryTree(List<TreeNode> nodes , int width, int level ){
        if(nodes.size()>0){
            List<TreeNode> local = new ArrayList<>((int)Math.pow(2,level));
            int nullCount=0;
            // 5,3,null,null
            // null,null,5,null
            // 5,null,null,4,
            // 5,null,3,null
            int startIndex=0,endIndex=0;
            int counter=0;
            boolean startSet=false;

            for(TreeNode node: nodes){
                if(node!=null){
                    local.add(node.left);
                    local.add(node.right);
                }else{
                    local.add(null);
                    local.add(null);
                }
                if(node==null) nullCount++;
                if(node!=null){
                    if(startSet==false){
                        startIndex=counter;
                        startSet=true;
                    }else{
                        endIndex=counter;
                    }
                }
                counter++;
            }
            int localWidth=endIndex-startIndex+1;

            if(nullCount==nodes.size()){
                return width ;
            }else{
                int wi=localWidth > width ? localWidth:width;
                return widthOfBinaryTree(local,wi,level+1);
            }
        }else{

            return width;
        }
    }
}
*/
