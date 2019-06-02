package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Link: daily coding problem
 * <p>
 * Desc: Given an array of integers, return a new array such that each element at index i of the new array
 * is the product of all the numbers in the original array except the one at i
 *
 * FOllow up: what if you can not use division
 *
 *
 */
public class ArrayElementManupulation {

    @Test
    public void test() {

        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, manipulate(new int[]{
                1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, manipulateFollowup(new int[]{
                1, 2, 3, 4, 5}));



    }

    private int[] manipulate(int[] ints) {

        int product=1;
        for (int i = 0; i < ints.length; i++) {
            product *= ints[i];
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = product / ints[i];
        }
        return ints;

    }

    private int[] manipulateFollowup(int[] ints) {

        int product=1;
        for (int i = 0; i < ints.length; i++) {
            product *= ints[i];
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = devideBySubtractging( product , ints[i]);
        }
        return ints;

    }

    private int devideBySubtractging(int product, int anInt) {
        int count=0;
        while(product>0){
            product=product-anInt;
            count++;
        }
        return count;
    }
}
