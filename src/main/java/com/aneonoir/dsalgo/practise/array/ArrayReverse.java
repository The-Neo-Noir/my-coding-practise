package com.aneonoir.dsalgo.practise.array;

/**
 * link : Self
 *
 */
public class ArrayReverse {
    int[] firstReverseTry(int[] arr) {
        int middleElement=arr.length/2;
        for(int i=0;i<middleElement;i++){
            int temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }
        return arr;
    }
}
