package com.aneonoir.dsalgo.practise.array;

public class Print {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {2, 3, 1, 5, 0},
                {7, 1, 5, 3, 1},
                {2, 5, 7, 8, 1},
                {0, 1, 5, 0, 1},
                {3, 4, 9, 1, 5}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= j) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
