package com.aneonoir.dsalgo.practise.array;

import java.util.Arrays;

/**
 * link :https://app.codesignal.com/challenge/8cWAm3sYiBSNXwMZ7
 *
 * -----
 * 06/01/20 1:44 PM : retried once.
 * Lets try with functional style in java. TODO: do it in functional style .
 * -----
 *
 *
 *
 */
public class ArrayMaximalAdjacentDiffernece {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int result = Math.abs(inputArray[1] - inputArray[0]);
        for (int i = 1; i < inputArray.length - 1; i++) {
            int current = Math.abs(inputArray[i + 1] - inputArray[i]);
            if (result < current) {
                result = current;
            }
        }
        return result;
    }

}
