package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 *
 * link: https://app.codesignal.com/arcade/intro/level-12/fQpfgxiY6aGiGHLtv
 *
 *
 */
public class DifferentSquares {


    @Test
    public void test() {
        int [][] a= new int[][]{{1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}};
        assertEquals(6, differentSquares(a));
    }

    int differentSquares(int[][] matrix) {
        int row=matrix.length;
        int column = matrix[0].length;
        Set<String> s= new HashSet<>();
        for(int i=0;i<row-1;i++){
            for(int j=0;j<column-1;j++){
                s.add( matrix[i][j]+""+matrix[i][j+1]+""+matrix[i+1][j]+""+matrix[i+1][j+1]);

            }
        }
        return s.size();
    }

}
