package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/challenge/tegkALuY9EqaMhHEu
 * <p>
 * approach:  this gave me trouble  see crate2DArray method, I got into nullpointerexception,
 * I was in assumption that how can someone create a crooked array in java, but solved it. see the Final methodl.
 */
public class Create2DArray {
    public static void main(String[] args) {

        create2DArray(new int[]{1, 2, 0, 4});
    }

    static int[][] create2DArray(int[] lengths) {
        int[][] result = new int[lengths.length][];
        for (int i = 0; i < lengths.length; i++) {
            for (int j = 0; j < lengths[i]; j++) {
                result[i][j] = j;
            }
        }
        return result;

    }

    static int[][] create2DArrayFinal(int[] lengths) {
        int[][] result = new int[lengths.length][4];
        for (int i = 0; i < lengths.length; i++) {
            int[] a = new int[lengths[i]];
            for (int j = 0; j < lengths[i]; j++) {
                a[j] = j;
            }
            result[i] = a;
        }
        return result;

    }

}
