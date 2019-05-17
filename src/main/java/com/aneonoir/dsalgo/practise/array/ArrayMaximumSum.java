package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5
 * <p>
 * Struggle : array index out of bounds exception
 */
public class ArrayMaximumSum {

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < inputArray.length - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                sum += inputArray[i + j];

            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
