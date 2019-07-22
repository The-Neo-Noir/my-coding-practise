package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://leetcode.com/problems/robot-return-to-origin/
 * <p>
 * approach:  a pretty brute force ,But there could be some trick that would result better performance.
 * <p>
 * Struggle: I thought I could manage with only one variable , but that would be wrong. I need both x and y
 */
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                x--;
            } else if (moves.charAt(i) == 'R') {
                x++;
            } else if (moves.charAt(i) == 'U') {
                y++;
            } else {
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}