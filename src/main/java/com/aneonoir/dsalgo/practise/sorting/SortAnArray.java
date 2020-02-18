package com.aneonoir.dsalgo.practise.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/sort-an-array/
 *
 * approach: a quick sort mechanism
 *
 * : 6 ms, faster than 97.96% of Java online submissions for Sort an Array
 *
 * related: https://leetcode.com/problems/day-of-the-week/
 * Largest Plus Sign
 * https://leetcode.com/problems/distinct-subsequences/
 *
 * TODO: see how others are doign it.
 *
 * tag: sorting, quicksort, interivew,
 */
public class SortAnArray {


    private void quicksort(int [] nums, int lo, int hi){
        if(lo<hi){
            int pivot= partition(nums,lo,hi);
            quicksort(nums,lo,pivot-1);
            quicksort(nums,pivot+1,hi);
        }
    }
    private int partition(int nums[],int lo,int hi){
        int pivot=nums[hi];
        int i=lo;
        for(int j=lo;j<hi;j++){
            if(nums[j]<pivot){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        int temp=nums[hi];
        nums[hi]=nums[i];
        nums[i]=temp;
        return i;
    }
    public List<Integer> sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        List<Integer> list= new ArrayList<>(nums.length);
        for(Integer i : nums){
            list.add(i);
        }
        return list;
    }
}
