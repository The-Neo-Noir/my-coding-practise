package com.aneonoir.dsalgo.practise.search;

/**
 * link: https://leetcode.com/problems/search-a-2d-matrix/submissions/
 * <p>
 * approach: its pretty obvious binary search, but I strugged at line 16.if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1])
 */
public class Searcha2DMatrix {
    public static void main(String[] args) {
        searchMatrix(new int[][]{{}}, 3);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null && matrix[0].length != 0) {
                if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                    result = binarySearch(matrix[i], target, 0, matrix[i].length - 1);
                }
            }
        }
        return result;
    }

    static boolean binarySearch(int matrix[], int target, int left, int right) {
        int mid = (right - left / 2) - left;
        if (left <= right) {
            if (target > matrix[mid]) {
                return binarySearch(matrix, target, mid + 1, right);
            } else if (target < matrix[mid]) {
                return binarySearch(matrix, target, 0, mid - 1);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}