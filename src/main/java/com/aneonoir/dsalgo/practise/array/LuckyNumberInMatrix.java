package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/
 *
 *  approach: scan through and find out the min of each row and highs of each colmn , the ones overlap are the luckynumber.
 *
 *  tag : easy , array,
 *
 * I went half way of the idea similar to the hint , but i stopped thinking before I moved on to see  the hint . The hint suggested idea which is slow.
 *
 * I did it pretty slow
 * I am sure there is going to be a faster way of dealing with this one.
 */
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        LuckyNumberInMatrix luckyNumberInMatrix = new LuckyNumberInMatrix();
        luckyNumberInMatrix.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});
    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();


        for (int row = 0; row < matrix.length; row++) {
            int rowMin = matrix[row][0];
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0) {
                    max.add(matrix[row][col]);
                } else {
                    if (matrix[row][col] > max.get(col)) {
                        max.set(col, matrix[row][col]);
                    }
                }

                if (matrix[row][col] < rowMin) {
                    rowMin = matrix[row][col];
                }
            }
            min.add(rowMin);
        }
        List<Integer> result = new ArrayList<>();

        Set<Integer> r = new HashSet<>();
        r.addAll(min);

        for (int i = 0; i < max.size(); i++) {
            if (r.contains(max.get(i))) result.add(max.get(i));
        }
        return result;
    }
}