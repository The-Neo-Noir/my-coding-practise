package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/pascals-triangle/submissions/
 * easy but can be imporved by using dynamic programming.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstRow = Arrays.asList(1);
        result.add(firstRow);
        if (numRows > 1) {
            List<Integer> secondRow = Arrays.asList(1, 1);

            result.add(secondRow);
            for (int i = 2; i < numRows; i++) {
                List<Integer> crow = new LinkedList<>();
                List<Integer> source = result.get(i - 1);

                crow.add(1);
                for (int j = 0; j < source.size() - 1; j++) {
                    crow.add(source.get(j) + source.get(j + 1));
                }
                crow.add(1);
                result.add(crow);
            }
        }
        return result;
    }
}