package com.aneonoir.dsalgo.practise.array;

/**
 *
 * link: https://app.codesignal.com/arcade/code-arcade/list-forest-edge/mCkmbxdMsMTjBc3Bm
 *
 * TODO: Can you do it in functional style
 * TODO: Can you do it in functional style
 *
 * HINt: Collections.replaceAll(i, e, s); will also work
 *
 *
 */
public class ArrayReplace {

    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==elemToReplace){
                inputArray[i]=substitutionElem;
            }
        }
        return inputArray;
    }


}
