package com.aneonoir.dsalgo.practise.tree;

/**
 * link::https://leetcode.com/problems/maximum-binary-tree/
 *
 * approach:
 *
 * TODO: can you do it using iterative method ?
 *
 *
 *
 * tag: interview, medium, recursion, tree,
 */
public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    private TreeNode construct(int [] nums, int low, int high){
        if(low<=high){
            int loc=findMaxLocation(nums,low,high);
            TreeNode root= new TreeNode(nums[loc]);
            root.left= construct(nums,low,loc-1);
            root.right=construct(nums,loc+1,high);
            return root;
        }else{
            return null;
        }
    }
    private int findMaxLocation(int nums[],int low, int high){
        int loc=low;
        int max=nums[loc];
        for(int i=low;i<=high;i++){
            if(max<nums[i]){
                loc=i;
                max=nums[i];
            }
        }
        return loc;
    }
}
