package com.aneonoir.dsalgo.practise.array;

/**
 * https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE
 * TODO: can you do it in functional style ? Using
 */
public class FindMaxAdjucentDifference {

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int difference = Math.abs(inputArray[0] - inputArray[1]);
        for (int i = 1; i < inputArray.length - 1; i++) {
            if (Math.abs(inputArray[i] - inputArray[i + 1]) > difference) {
                difference = Math.abs(inputArray[i] - inputArray[i + 1]);
            }
        }
        return difference;
    }

}

