package com.aneonoir.dsalgo.practise.sorting;

/**
 * link: https://practice.geeksforgeeks.org/problems/bubble-sort/1
 * <p>
 * approach: a bubble sort if implemented wrong way then it would give you o(n*n).
 * Which is not ideal, the best case in this approach will solve it in o(n)
 */
public class BubbleSortWithOnApproach {


    public static void main(String[] args) {
        bubbleSortWithCheck(new int[]{
                1, 2, 4, 5, 6});

    }

    private static void swap(int items[], int j, int y) {
        int temp = items[j];
        items[j] = items[y];
        items[y] = temp;
    }

    private static void bubbleSortWithCheck(int[] items) {
        int len = items.length;

        for (int i = 0; i < len; i++) {
            boolean sorted = false;
            for (int j = 0, stop = len - i; j < stop - 1; j++) {
                if (items[j] > items[j + 1]) {
                    swap(items, j, j + 1);
                    sorted = true;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}
