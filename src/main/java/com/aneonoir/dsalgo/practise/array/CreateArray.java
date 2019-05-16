package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;

/**
 *
 * link: https://app.codesignal.com/arcade/code-arcade/list-forest-edge/gmZFbpR9cirL3Jpf2
 *
 */
public class CreateArray {

    int[] createArray(int size) {
        int result []= new int[size];
        int counter=0;
        while(counter<result.length){
            result[counter]=1;
            counter++;
        }
        return result;
    }

    /**
     * Using existing library function
     */
    int[] createArrayExistingLibrary(int size) {

        int[] a = new int[size];
        Arrays.fill(a,1);
        return a;
    }

}
