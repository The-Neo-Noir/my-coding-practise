package com.aneonoir.dsalgo.practise.tree;

import java.util.Arrays;

/**
 *
 * link: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/
 *
 *
 * struggle struggle:  Practise it a lot, very good questions
 * <p>
 * <p>
 * learning: Java is pass by value,  Arrays.copyOfRange
 * <p>
 * todo:
 * 1. can you do it iteratively .
 * 2. DO it without copying the new array, ( possibly why its slow. ) https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/
 * 3. withit without returning the array , just pass by value and
 */
public class ContructTreeFromInorderAndPostOrderTraversal {


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // empty checks later on
        int rootData = postorder[postorder.length - 1];
        TreeNode n = new TreeNode(rootData);
       // construct(n, inorder, postorder, 0, inorder.length - 1, "");
        construct(n);
        return n;
    }
    private void construct(TreeNode root) {
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
    }

    private void construct(TreeNode root, int inorder[], int postorder[], int low, int high, String dir) {
        if (low < high) {
            int rootData = postorder[high];
            TreeNode rootLocal = new TreeNode(rootData);
            if (dir.equals("left")) {
                root.left = rootLocal;
            } else {
                root.right = rootLocal;
            }

            int indexOfRoot = 0;
            for (int i = low; i <= high; i++) { //inorder search element
                if (inorder[i] == rootData) {
                    indexOfRoot = i;
                    break;
                }
            }
            int localInorderLeft[] = Arrays.copyOfRange(inorder, low, indexOfRoot);
            int localInorderRight[] = Arrays.copyOfRange(inorder, indexOfRoot + 1, high);

            int numberOfRightNodes = high - indexOfRoot;
            int numberOfLeftNodes = indexOfRoot - low;

            int localPostOrderLeft[] = Arrays.copyOfRange(postorder, high - numberOfLeftNodes, high);
            int localPostOrderRight[] = Arrays.copyOfRange(postorder, low, low + numberOfRightNodes + 1);

            construct(rootLocal, localInorderLeft, localPostOrderLeft, 0, localInorderLeft.length - 1, "left"); //left
            construct(rootLocal, localInorderRight, localPostOrderRight, 0, localInorderRight.length - 1, "right"); // right
        }
    }

    public static void main(String[] args) {

        int inorder[] = {14, 9, 13, 3, 15, 20, 7};
        int postorder[] = {14, 13, 9, 15, 7, 20, 3};
        ContructTreeFromInorderAndPostOrderTraversal contructTreeFromInorderAndPostOrderTraversal = new ContructTreeFromInorderAndPostOrderTraversal();
        TreeNode treeNode = contructTreeFromInorderAndPostOrderTraversal.buildTree(inorder, postorder);
    }

}

    /*  Working copy
    public static void main(String[] args) {

        int inorder[] = {14, 9, 13, 3, 15, 20, 7};
        int postorder[] = {14, 13, 9, 15, 7, 20, 3};
        ContructTreeFromInorderAndPostOrderTraversal contructTreeFromInorderAndPostOrderTraversal = new ContructTreeFromInorderAndPostOrderTraversal();
        TreeNode treeNode = contructTreeFromInorderAndPostOrderTraversal.buildTree(inorder, postorder);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // empty checks later on
        int rootData = postorder[postorder.length - 1];
        TreeNode construct = construct(null, inorder, postorder, 0, inorder.length - 1);
        return construct;
    }

    private TreeNode construct( TreeNode root, int inorder[], int postorder[], int low, int high) {

        if (low <=high) {
            int rootData = postorder[high];
            TreeNode rootLocal = new TreeNode(rootData);

            int indexOfRoot = 0;
            for (int i = low; i <= high; i++) { //inorder search element
                if (inorder[i] == rootData) {
                    indexOfRoot = i;
                    break;
                }
            }
            int localInorderLeft[] = Arrays.copyOfRange(inorder, low, indexOfRoot);
            int localInorderRight[] = Arrays.copyOfRange(inorder, indexOfRoot + 1, high+1);

            int numberOfRightNodes = high - indexOfRoot;
            int numberOfLeftNodes = indexOfRoot - low;

            int localPostOrderRight[] = Arrays.copyOfRange(postorder, high - numberOfRightNodes, high);
            int localPostOrderLeft[] = Arrays.copyOfRange(postorder, low, low + numberOfLeftNodes );

            rootLocal.left=construct(rootLocal, localInorderLeft, localPostOrderLeft, 0, localInorderLeft.length - 1); //left
            rootLocal.right=construct(rootLocal, localInorderRight, localPostOrderRight, 0, localInorderRight.length - 1); // right
            return rootLocal;
        }
        return null;
    }
}*/


//  Buggy but the result is coming pass by value
//
// public TreeNode buildTree(int[] inorder, int[] postorder) {
//        // empty checks later on
//        int rootData=postorder[postorder.length-1];
//        TreeNode n= new TreeNode(rootData);
//        construct( n, inorder,postorder,0,inorder.length-1,"");
//        return n;
//    }
//    private void construct(TreeNode root,int  inorder[] , int postorder[],int low, int high,String dir){
//        if(low<high){
//            int rootData=postorder[high];
//            TreeNode  rootLocal= new TreeNode(rootData);
//            if( dir.equals("left")){
//                root.left=rootLocal;
//            }else{
//                root.right=rootLocal;
//            }
//
//            int indexOfRoot=0;
//            for(int i=low;i<=high;i++){ //inorder search element
//                if(inorder[i]==rootData){
//                    indexOfRoot=i;
//                    break;
//                }
//            }
//            int localInorderLeft[]=Arrays.copyOfRange(inorder,low,indexOfRoot);
//            int localInorderRight[]=Arrays.copyOfRange(inorder,indexOfRoot+1,high);
//
//            int numberOfRightNodes=high-indexOfRoot;
//            int numberOfLeftNodes= indexOfRoot- low;
//
//            int localPostOrderLeft[]=Arrays.copyOfRange(postorder,high-numberOfLeftNodes,high);
//            int localPostOrderRight[]=Arrays.copyOfRange(postorder,low,low+numberOfRightNodes+1);
//
//            construct(rootLocal,localInorderLeft,localPostOrderLeft,  0,localInorderLeft.length-1,"left"); //left
//            construct(rootLocal,localInorderRight,localPostOrderRight ,0,localInorderRight.length-1,"right"); // right
//        }
//    }
//}