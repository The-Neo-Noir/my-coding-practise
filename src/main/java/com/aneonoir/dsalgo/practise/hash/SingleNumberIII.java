package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/single-number-iii/submissions/
 *
 * why slow : Runtime: 5 ms, faster than 24.92% of Java online submissions for Single Number III.
 *
 * tag: hash,duplicate finding, array, interview,
 *
 * TODO: find why its slow can you do it faster.
 *
 */

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer in: nums){
            map.put(in, map.getOrDefault(in,0)+1);
        }
        int [] result=new int[2];
        int i=0;
        for(Integer in : map.keySet()){
            if(map.get(in)==1){
                result[i++]=in;
            }
        }
        return result;
    }
}
