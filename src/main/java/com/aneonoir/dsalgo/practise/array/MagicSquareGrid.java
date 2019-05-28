package com.aneonoir.dsalgo.practise.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * link: https://leetcode.com/problems/magic-squares-in-grid/submissions/
 * <p>
 * struggle:
 * //finding how rows should this iterate
 * //forgetting to put element
 * <p>
 * Learnings:
 * > how to find both diagonal, columns and rows.
 * > how to traverse till a certain row and column indexes for a given width
 */
public class MagicSquareGrid {

    public int numMagicSquaresInside(int[][] grid) {
        int counter = 0;
        if (grid.length < 3 || grid[0].length < 3) {
            counter = 0;
        } else {
            for (int row = 0; row < grid.length - 2; row++) { //finding how rows should this iterate
                for (int col = 0; col < grid[row].length - 2; col++) { // finding how many columns should this iterate
                    int[][] query = new int[3][3];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            query[i][j] = grid[i + row][j + col];
                        }
                    }
                    if (isMagicSquare(query)) {
                        counter++;
                    }
                }

            }

        }
        return counter;
    }

    public boolean isMagicSquare(int[][] grid) {
        // 1 to 9 must be there
        // sumRows=sumColumns=SumDiagonals
        int sumRows[] = new int[3];
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        int sumColumn[] = new int[3];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                } else {
                    if (map.containsKey(grid[i][j])) {
                        return false;
                    } else {
                        map.put(grid[i][j], grid[i][j]); //forgetting to put element
                    }
                    sumRows[i] += grid[i][j];
                    if (i == j) {
                        sumDiagonal1 += grid[i][j];
                    }
                    if (i + j == 2) {
                        sumDiagonal2 += grid[i][j];
                    }
                    sumColumn[i] += grid[j][i];
                }

            }
        }

        Set<Integer> s = new HashSet<>();
        s.add(sumDiagonal1);
        s.add(sumDiagonal2);
        for (int i = 0; i < 3; i++) {
            s.add(sumRows[i]);
            s.add(sumColumn[i]);
        }
        if (s.size() == 1) {
            return true;
        } else {
            return false;
        }
    }
}



