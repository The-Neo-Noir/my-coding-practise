package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;

/**
 * link: https://leetcode.com/problems/single-number-ii/
 *
 * solution : used an extramemory to solve it.
 *
 * follow up: can you solve it without using extra memory ?  Hint: use bitwise.
 *
 * tag: interview, hashmap, bitwise,hash
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer m: nums){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        int result=-1;
        for(Integer n: map.keySet()){
            if(map.get(n)==1){
                result=n;
                break;
            }
        }
        return result;
    }
}
