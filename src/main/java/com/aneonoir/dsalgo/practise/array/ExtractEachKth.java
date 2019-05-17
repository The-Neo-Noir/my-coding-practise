package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;

/**
 *
 * link: https://app.codesignal.com/arcade/intro/level-8/3AgqcKrxbwFhd3Z3R
 *
 *
 * Struggle: Look at the ugly code ;I used array list, can you do it without it ?? hint see the solution
 * TOOD:
 */
public class ExtractEachKth {

    int[] extractEachKth(int[] inputArray, int k) {
        int [] result=inputArray;
        ArrayList al = new ArrayList();
        if(k>inputArray.length){
            return inputArray;
        }else{
            for(int i=0;i<inputArray.length;i++){
                if((i+1)%k!=0){
                    al.add(inputArray[i]);
                }

            }
        }
        result=new int[al.size()];
        int counter=0;
        for(int i=0;i<al.size();i++){
            result[i]=Integer.valueOf(al.get(i).toString()).intValue();
        }
        return result;
    }

}
