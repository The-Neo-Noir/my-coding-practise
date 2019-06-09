package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * https://app.codesignal.com/arcade/code-arcade/waterfall-of-integration/tQgasP8b62JBeirMS
 */
public class SodokuSolution {


    @Test
    public void test() {
        assertTrue(sudoku(new int[][]{{1, 3, 2, 5, 4, 6, 9, 8, 7},
                {4, 6, 5, 8, 7, 9, 3, 2, 1},
                {7, 9, 8, 2, 1, 3, 6, 5, 4},
                {9, 2, 1, 4, 3, 5, 8, 7, 6},
                {3, 5, 4, 7, 6, 8, 2, 1, 9},
                {6, 8, 7, 1, 9, 2, 5, 4, 3},
                {5, 7, 6, 9, 8, 1, 4, 3, 2},
                {2, 4, 3, 6, 5, 7, 1, 9, 8},
                {8, 1, 9, 3, 2, 4, 7, 6, 5}}));

        assertFalse(sudoku(new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 3, 9, 5, 3, 4, 8},
                {1, 9, 8, 1, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}}));
    }

    boolean sudoku(int[][] grid) {
        boolean result = true;
        for (int i = 0; i < grid.length; i += 3) {
            for (int j = 0; j < grid.length; j += 3) {
                System.out.printf("%d %d", i, j);
                Sodoku sodoku = buildThreeByThree(i, j, grid);
                if (!sodoku.isValid()) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private Sodoku buildThreeByThree(int row, int col, int[][] grid) {
        int[][] data = new int[3][3];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                data[i % 3][j % 3] = grid[i][j];
            }
        }
        return new Sodoku(data);

    }

    class Sodoku {

        private final boolean isValid;
        int data[][] = new int[3][3];

        public Sodoku(int[][] data) {
            this.data = data;
            isValid = validate();
        }

        public boolean isValid() {
            return isValid;
        }

        public boolean validate() {
            HashSet<Integer> integers = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    integers.add(data[i][j]);
                }
            }
            return integers.size() == 9;
        }
    }

}

