package com.aneonoir.dsalgo.practise.math;

import java.util.stream.IntStream;

/**
 *
 * link: https://app.codesignal.com/challenge/bMQGHkhtm9ft43yxL
 *
 * TODO: solve the functional one
 */
public class Summation {

    int houseNumbersSum(int[] inputArray) {
        int sum=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==0){
                break;
            }else{
                sum+=inputArray[i];
            }
        }
        return sum;
    }
//TODO:
    int houseNumbersSumFunctional(int[] inputArray) {
      //  IntStream.of(inputArray).
        return 0;
    }
}
