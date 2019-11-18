package com.aneonoir.dsalgo.practise.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class InsertionSort {

    @Test
    public void main() {
        InsertionSort insertionSort = new InsertionSort();
        int[] a = {3, 2, 1};
        insertionSort.sort(a);
        Assert.assertArrayEquals(new int[]{1, 2, 3}, a);
        int[] b = {1, 2, 1};
        insertionSort.sort(a);
        Assert.assertArrayEquals(new int[]{1, 2, 1}, b);

        int[] c = {1, 2, 3};
        insertionSort.sort(a);
        Assert.assertArrayEquals(new int[]{1, 2, 3}, c);

    }

    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            for (int j = i; j > 0; j--) {

                int insertPosition = j;
                boolean flag = false;
                if (current < a[j - 1]) {
                    a[j] = a[j - 1];
                    insertPosition = j - 1;
                    flag = true;
                }
                if (flag)
                    a[insertPosition] = current;
            }
        }
    }
}

