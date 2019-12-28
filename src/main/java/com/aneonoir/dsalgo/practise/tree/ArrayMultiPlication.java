package com.aneonoir.dsalgo.practise.tree;

public class ArrayMultiPlication {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 4}, {3, 5, 6}, {4, 3, 2}, {2, 1, 5}};
        System.out.println(colMul(arr, 0));

    }

    private static int colMul(int arr[][], int column) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result *= arr[i][column];
        }
        return result;
    }
}
