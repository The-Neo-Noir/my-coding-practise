package com.aneonoir.dsalgo.practise.math.geometry;

/**
 * link: https://www.lintcode.com/problem/valid-triangle/description
 *
 *
 */
public class ValidTriangle {

    public boolean isValidTriangle(int a, int b, int c) {
        return a+b>c && b+c > a && a+c>b ;
    }

}
