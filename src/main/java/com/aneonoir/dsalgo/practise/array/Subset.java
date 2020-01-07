package com.aneonoir.dsalgo.practise.array;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/subsets/submissions/
 *
 * solution: used bit wise
 *
 * tag: interview, bitwise,array,subset , combination. permutation k
 *
 * runtime: Runtime: 1 ms, faster than 27.65% of Java online submissions for Subsets.
 *
 *
 * todo: can you do it for string ? how about linked list ?, can you do the array in recursion ?
 *
 * TODO: see how can it be faster ? its quite slow performance.
 *
 *
 *
 */
public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        int size=nums.length;
        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<(int)Math.pow(2,size);i++){
            List<Integer> localList= new LinkedList<>();
            String in= Integer.toBinaryString(i);
            if(in.length()<size){
                int length=size-in.length();
                for(int cun=0;cun<length;cun++){
                    in="0"+in;
                }
            }
            int counter=0;
            for(int j=0;j<nums.length;j++){
                if(in.charAt(counter)=='1'){
                    localList.add(nums[j]);
                }
                counter++;
            }
            result.add(localList);
        }
        return result;
    }
}