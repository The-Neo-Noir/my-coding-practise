package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-backwoods/Nh48Nqxb2zGx2NvYK/solutions
 *
 * struggle: no, just see if you can do it any better
 */
public class CrossingSum
{
    int crossingSum(int[][] matrix, int a, int b) {
        int rowSum=0,colSum=0;
        for(int i=0;i<matrix[0].length;i++){
            rowSum+=   matrix[a][i];
        }
        for(int i=0;i<matrix.length;i++){
            colSum+=matrix[i][b];
        }
        return rowSum+colSum-matrix[a][b];
    }

}
