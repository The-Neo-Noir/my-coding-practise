package com.aneonoir.dsalgo.practise.array;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * I did not do it mindfully, I have to do it again. Did a lot of debugging, in the ide,
 *
 * The main struggle, was in finding the duplicate, then I realised, I don't need to check for duplicate.
 *
 * TODO: must do agian.,  can you do it in iterattion and and recursioon ?
 *
 *
 * tag: interview, matrix, traversal , struggle
 *
 * slow performance, so many loops dude , this is also a pattern while solving tree traversal problem . fix it
 */
public class DiagonalTraverse {

    public static void main(String[] args) {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        int[] diagonalOrder = diagonalTraverse.findDiagonalOrder(new int[][]{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}});


    }
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length>0){
            Queue<Cell> que = new LinkedList<>();
            que.add(new Cell(0, 0));
            List<Integer> result = new LinkedList<>();
            int counter = 0;
            while (!que.isEmpty()) {
                List<Cell> cells = new LinkedList<>();
                while (!que.isEmpty()) {
                    cells.add(que.remove());
                }
                for (int i = 0; i < cells.size(); i++) {
                    Cell s = cells.get(i);
                    if (s.row <= matrix.length - 1 && s.col + 1 <= matrix[s.row].length-1) {
                        Cell e = new Cell(s.row, s.col + 1);
                        que.add(e);

                    }
                    if (i == cells.size() - 1) {
                        if (s.row + 1 <= matrix.length - 1 && s.col <= matrix[s.row + 1].length-1) {
                            que.add(new Cell(s.row + 1, s.col));
                        }
                    }
                }
                for (int i = 0; i < cells.size(); i++) {
                    if (counter % 2 == 0) {
                        result.add(matrix[cells.get(cells.size() - 1 - i).row][cells.get(cells.size() - 1 - i).col]);
                    } else {
                        result.add(matrix[cells.get(i).row][cells.get(i).col]);
                    }
                }
                counter++;
            }
            int resultFinal[] = new int[result.size()];
            int i = 0;
            for (Integer in : result) {
                resultFinal[i++] = in;
            }
            return resultFinal;
        }else{
            return new int[0];
        }

    }

    class Cell {
        int row, col;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            } else {
                if (obj instanceof Cell) {
                    Cell cell = (Cell) obj;
                    return this.row - cell.row == 0 ? this.col - cell.col == 0 ? true : false : false;
                } else return false;
            }
        }

    }
}
