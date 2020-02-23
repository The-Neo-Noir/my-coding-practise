package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/product-of-array-except-self/
 *
 * approach: read it in the solution.
 *
 * tag: interview, math,tricky, array
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int lef[]= new int[nums.length];
        int right[]= new int[nums.length];
        lef[0]=1;
        for(int i=0;i<nums.length-1;i++){
            lef[i+1]=lef[i]*nums[i];
        }
        right[nums.length-1]=1;
        for(int i=nums.length-1;i>0;i--){
            right[i-1]=right[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=lef[i]*right[i];
        }
        return nums;
    }
}