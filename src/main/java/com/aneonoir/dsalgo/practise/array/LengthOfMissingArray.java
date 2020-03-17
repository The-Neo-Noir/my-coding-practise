package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://www.codewars.com/kata/57b6f5aadb5b3d0ae3000611/solutions/java/me/best_practice
 *
 * todo: very ugly code,see how are they doing it ?
 *
 * tag: array , struggle
 */
public class LengthOfMissingArray {

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        // int min= arrayOfArrays!=null && arrayOfArrays.length > 1 ?  arrayOfArrays[0].length : Integer.MAX_VALUE;
        if (arrayOfArrays == null || (arrayOfArrays != null && arrayOfArrays.length == 0)) return 0;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i] != null) {
                if (arrayOfArrays[i].length == 0) return 0;
                sum += arrayOfArrays[i].length;
                if (max < arrayOfArrays[i].length) {
                    max = arrayOfArrays[i].length;
                }
                if (min > arrayOfArrays[i].length) {
                    min = arrayOfArrays[i].length;
                }
            } else {
                return 0;
            }
        }
        System.out.println(max + "" + min);
        min = min - 1;
        return (max * (max + 1) / 2) - (min * (min + 1) / 2) - sum;
    }
}
