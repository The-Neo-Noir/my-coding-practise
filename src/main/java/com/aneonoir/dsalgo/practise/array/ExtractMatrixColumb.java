package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/challenge/vq3ZbmsHRdjzv2WKQ
 *
 */
public class ExtractMatrixColumb {

    int[] extractMatrixColumn(int[][] matrix, int column) {
        int [] result= new int[matrix.length];
        for(int row=0;row<matrix.length;row++ ){
            result[row]= matrix[row][column];
        }
        return result;
    }

}
