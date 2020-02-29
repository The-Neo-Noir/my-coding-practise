package com.aneonoir.dsalgo.practise.sorting;

import java.util.TreeMap;

/**
 * link: https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 *
 * appraoch: pretty bruteforce, There should exist a faster solution, possibly binary search
 *
 * tag:
 */
public class ElementAppearningMoreThanTwntyFivePercentag {
    public int findSpecialInteger(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>((a, b)->b-a);
        int limit=arr.length/4;
        for(Integer i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int result=0;
        for(Integer in : map.keySet()){
            if(map.get(in)>limit){
                result=in;
                break;
            }
        }
        return result;
    }
}