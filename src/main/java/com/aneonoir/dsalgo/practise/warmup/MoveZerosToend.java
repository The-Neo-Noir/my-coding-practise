package com.aneonoir.dsalgo.practise.warmup;

/**
 * link: https://leetcode.com/problems/move-zeroes/
 * tag: interview,array
 * Struggle
 * TODO: still failing test case, not even sure if its optimal
 */
public class MoveZerosToend {
    public void moveZeroes(int[] nums) {
        int countsOfZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) countsOfZero++;
        }
        int current=0;
        int lastNumberFound=0;
        if(countsOfZero==0){
            return;
        }
        for(int i=0;i<nums.length;i++){

            for(int j=lastNumberFound+1;j<nums.length;j++){
                if(nums[j]!=0){
                    lastNumberFound=j;
                    break;
                }
            }
            nums[i]=nums[lastNumberFound];

        }
        int t=0;;
        while(t<countsOfZero){
            nums[nums.length-1-t]=0;
            t++;
        }
    }
}
