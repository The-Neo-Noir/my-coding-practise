package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://www.lintcode.com/problem/paint-fill/description
 * <p>
 * approach: simple, look up
 * <p>
 * tag: matrix, array, lookup
 */
public class PaintFill {
    public boolean paintFill(int[][] screen, int x, int y, int newColor) {
        return screen[x][y] != newColor;
    }
}
