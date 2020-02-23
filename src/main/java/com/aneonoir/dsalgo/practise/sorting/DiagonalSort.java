package com.aneonoir.dsalgo.practise.sorting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/sort-the-matrix-diagonally/submissions/
 * <p>
 * approach: > understand the diagonally elements present, by using a hash , every diagonal element
 * has the same difference.
 * > then sort.
 * >
 * I used a selection sort, but it could have been a couting sort to make it faster.
 *
 * Runtime: 30 ms, faster than 5.05% of Java online submissions for Sort the Matrix Diagonally.
 *
 * tags: arrays, matrix, sorting, selection sort.
 */
public class DiagonalSort {

    public static void main(String[] args) {
        DiagonalSort diagonalSort = new DiagonalSort();
        diagonalSort.diagonalSort(new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}});
    }

    public int[][] diagonalSort(int[][] mat) {

        HashMap<Integer, List<Location>> map = new HashMap<>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                int diff = row - col;
                if (map.containsKey(diff)) {
                    map.get(diff).add(new Location(row, col));
                } else {
                    LinkedList<Location> ll = new LinkedList<>();
                    ll.add(new Location(row, col));
                    map.put(diff, ll);
                }
            }
        }
        for (Integer key : map.keySet()) {
            List<Location> list = map.get(key);
            sort(list, mat);
        }
        return mat;
    }

    private void sort(List<Location> lists, int[][] mat) {
        for (int i = 0; i < lists.size(); i++) {
            Location min = lists.get(i);
            int minv = mat[min.row][min.col];
            int swap = i;
            for (int j = i + 1; j < lists.size(); j++) {
                if (minv > mat[lists.get(j).row][lists.get(j).col]) {
                    swap = j;
                    minv = mat[lists.get(j).row][lists.get(j).col];
                }
            }
            int temp = mat[min.row][min.col];
            mat[min.row][min.col] = mat[lists.get(swap).row][lists.get(swap).col];
            mat[lists.get(swap).row][lists.get(swap).col] = temp;
        }
    }

    class Location {
        int row;
        int col;

        Location(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
