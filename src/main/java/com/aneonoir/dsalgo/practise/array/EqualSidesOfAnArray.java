package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://www.codewars.com/kata/5679aa472b8f57fb8c000047/solutions/java/me/best_practice
 *
 * todo: I think it can be improved.
 *
 * tag: array, easy brute-force.
 *
 */
public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;
            // left sde;
            if (i > 0) {
                for (int l = i - 1; l >= 0; l--) {
                    leftsum += arr[l];
                }
            }
            int rightsum = 0;
            for (int r = i + 1; r < arr.length; r++) {
                rightsum += arr[r];
            }
            if (leftsum == rightsum) {
                result = i;
                break;
            }
        }
        return result;
    }
}
