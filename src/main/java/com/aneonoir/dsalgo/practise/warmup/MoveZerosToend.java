package com.aneonoir.dsalgo.practise.warmup;

/**
 * link: https://leetcode.com/problems/move-zeroes/
 * tag: interview,array
 * Struggle
 * TODO:  Can you do even better
 * <p>
 * update: solved it faster ,
 * <p>
 * tag: interview, array
 */
public class MoveZerosToend {

    /* A non working solution
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
    }*/

    public void moveZeroes(int[] nums) {
        int countOfZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) countOfZeros++;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
