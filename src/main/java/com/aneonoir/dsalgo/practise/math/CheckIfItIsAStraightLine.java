package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://leetcode.com/problems/check-if-it-is-a-straight-line/
 * <p>
 * Note: Cross product can determine colinearity ( if they fall in the same line ) . Go figure it out.
 * <p>
 * struggle : [[-3,-2],[-1,-2],[2,-2],[-2,-2],[0,-2]] failed.
 * <p>
 * TODO: not done yet, there are many different ways people are solving it. This approach I took failed test cases
 * see how other people are solving it.
 */
public class CheckIfItIsAStraightLine {

    public static void main(String[] args) {
        CheckIfItIsAStraightLine checkIfItIsAStraightLine = new CheckIfItIsAStraightLine();
        boolean b = checkIfItIsAStraightLine.checkStraightLine(new int[][]{{-3, -2}, {-1, -2}, {2, -2}, {-2, -2}, {0, -2}});
        System.out.println(b);

    }

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        } else {
            int x1 = coordinates[0][0];
            int y1 = coordinates[0][1];
            int x2 = coordinates[1][0];
            int y2 = coordinates[1][1];
            int x1Car = x1 * y2;
            int y1Car = y1 * x2;
            boolean result = true;
            for (int i = 1; i < coordinates.length - 1; i++) {
                x2 = coordinates[i][0];
                y2 = coordinates[i][1];
                int x3 = coordinates[i + 1][0];
                int y3 = coordinates[i + 1][1];
                int x2Car = x2 * y3;
                int y2Car = y2 * x3;
                if (x2Car - x1Car != y2Car - y1Car) {
                    result = false;
                    break;
                }
                x1Car = x2Car;
                y1Car = y2Car;
            }
            return result;
        }
    }
}
