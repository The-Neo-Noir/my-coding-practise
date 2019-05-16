package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-forest-edge/vPJB7T28fyCeh2Ljn *
 *
 *
 *
 */
public class RemovePartOfArray {

    int[] removeArrayPart(int[] inputArray, int l, int r) {
        int sizeOftheTargetArray=inputArray.length-((r-l)+1);
        int result []= new int[sizeOftheTargetArray];
        int count=0;
        for(int i=0;i<inputArray.length;i++){
            if(!(i>=l && i<=r)){
                result[count++]=inputArray[i];
            }
        }
        return result;
    }

}
