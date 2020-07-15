package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;

/**
 * link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 *
 * tag: sorting, math ,easy
 *
 * Can you do even better ?
 */
public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int val=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(val!=arr[i+1]-arr[i]) return false;
        }
        return true;
    }
}
