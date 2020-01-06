package com.aneonoir.dsalgo.practise.array;

/**
 * https://app.codesignal.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg/solutions
 *
 * approach: solved it
 *
 * tag: array,interivew.
 */
public class ArrayChange {
    int arrayChange(int[] inputArray) {
        int result=0;
        for(int i=0;i<inputArray.length-1;i++){
            if(inputArray[i+1]<=inputArray[i]){
                int count=Math.abs(inputArray[i+1]-inputArray[i])+1;
                result+=count;
                inputArray[i+1]=inputArray[i+1]+count;
            }
        }
        return result;
    }
}
