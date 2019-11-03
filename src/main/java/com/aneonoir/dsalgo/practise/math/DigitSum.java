package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/challenge/gmg3rya2qWsFDTchB
 *  TODO: can you do recursion ?
 *
 *
 */
public class DigitSum {
    int digitSum(int n) {
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n=n/10;
        }
        return sum;
    }

}
