package com.aneonoir.dsalgo.practise.array;

/**
 * https://app.codesignal.com/arcade/code-arcade/list-forest-edge/GeqSK26bvdrarkGH9/solutions
 */
public class ConcatenateArray {

    int[] concatenateArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }

}
