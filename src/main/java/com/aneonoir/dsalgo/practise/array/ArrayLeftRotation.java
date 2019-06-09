package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class ArrayLeftRotation {

    static int[] rotLeft(int[] a, int d) {

        for (int iteration = 0; iteration < d; iteration++) {

            int retainer = a[0];
            for (int in = 0; in < a.length - 1; in++) {
                a[in] = a[in + 1];
            }
            a[a.length - 1] = retainer;


        }
        return a;

    }
}
