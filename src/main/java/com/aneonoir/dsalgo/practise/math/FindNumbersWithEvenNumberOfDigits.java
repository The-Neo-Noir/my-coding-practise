package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * <p>
 * approach: 1. Use string and its lengh , ( slow) 2. used math operation ( still slow) , 3. Use Logarithm  , surprisingly fast.
 * <p>
 * <p>
 * RUNTIME:     Runtime: 1 ms, faster than 96.56% of Java online submissions for Find Numbers with Even Number of Digits.
 * <p>
 * tag: interview , math,
 * <p>
 * NOte: learnings: HOW TO FIND THE LENGTH OF A DECIMAL NUMBER use Math.log10(num)+1, voila .
 */
public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int result = 0;
        for (Integer in : nums) {
            if (((int) Math.log10(in) + 1) % 2 == 0)
                result++;
        }
        return result;
    }
    /**
     *Runtime: 4 ms, faster than 9.07% of Java online submissions for Find Numbers with Even Number of Digits.

     public int findNumbers(int[] nums) {
     int result=0;
     for(Integer in: nums){
     if((in+"").length()%2==0){
     result++;
     }
     }
     return result;
     } */
}
