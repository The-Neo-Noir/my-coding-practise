package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1
 * <p>
 * approach: decompose input and if found 0 then create number with 5*Math(10,i)
 * <p>
 * tag: math,interview
 */
public class ReplaceAllZerosWithFIve {
    int convertfive(int num) {
        int fo = 0;
        int i = 0;
        int re = num;
        while (num > 0) {
            int mod = num % 10;
            if (mod == 0) {
                fo = fo + 5 * (int) Math.pow(10, i);
            }
            num = num / 10;
            i++;
        }
        return fo + re;
    }
}
