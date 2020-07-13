package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * link: https://leetcode.com/problems/range-sum-query-immutable/
 *
 * approach: populate each column with value from previous colun by adding.
 *
 * //TODO : there seems to be a faster way, try learn from other submissions.
 * tag: easy, dynamic programming.
 */
public class RangeSumQueryImmutable {
    int pre[]=null;
    public RangeSumQueryImmutable(int[] nums) {
        if(nums!=null && nums.length!=0 ){
            pre= new int[nums.length];
            pre[0] =nums[0];
            for(int i=1;i<nums.length;i++){
                pre[i]=pre[i-1]+nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(pre==null) return 0;
        if(i==0) return pre[j];
        else{
            return pre[j]-pre[i-1];
        }
    }
}
