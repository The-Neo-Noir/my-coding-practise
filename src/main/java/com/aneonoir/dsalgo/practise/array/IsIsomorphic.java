package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-backwoods/xKYm98etd9JRsTcZY
 */
public class IsIsomorphic {
    boolean areIsomorphic(int[][] array1, int[][] array2) {
        boolean rowsEquals = array1.length == array2.length;
        if (rowsEquals) {
            boolean isColumnEquals = true;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].length != array2[i].length) {
                    isColumnEquals = false;
                    break;
                }
            }
            return isColumnEquals;
        } else {
            return false;
        }
    }

}
