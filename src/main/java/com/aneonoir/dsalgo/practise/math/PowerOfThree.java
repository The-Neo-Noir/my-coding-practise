package com.aneonoir.dsalgo.practise.math;

/**
 * link ; https://leetcode.com/problems/power-of-three/
 *
 * TODO: solve iteratively
 *       solve recursively
 *       solve without any two above
 */
public class PowerOfThree {
    public static void main(String[] args) {
        int number=6;
        boolean powerOfThree=false;
        while(number>3){

            if (number % 3 != 0) {
                 powerOfThree = false;
                 break;
            }else{
                powerOfThree=true;
            }
            number = number / 3;
        }
        System.out.println(powerOfThree);

    }
}
