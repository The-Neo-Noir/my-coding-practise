package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://leetcode.com/problems/available-captures-for-rook/
 * <p>
 * solution: pretty bruteforce,
 * <p>
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
 * Memory Usage: 34 MB, less than 100.00% of Java online submissions for Available Captures for Rook.
 * <p>
 * tags: array,chess,interview.
 * <p>
 * Solved it in the firt attempt, however I feel instead of using 5 loops I could used less loops. to solve it. essentially less verbose code .
 * <p>
 * TODO: write less verbose code.
 */
public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int fow = 0, fol = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == 'R') {
                    fow = row;
                    fol = col;
                }
            }
        }
        return findHorizontal(board, fow, fol) + findVertical(board, fow, fol);
    }

    private int findHorizontal(char board[][], int row, int col) {
        int left = col - 1;
        int right = col + 1;
        int found = 0;
        while (left >= 0) {
            if (board[row][left] == 'B' || board[row][left] == 'P') {
                break;
            }
            if (board[row][left] == 'b' || board[row][left] == 'p') {
                found = 1;
                break;
            }
            left--;
        }
        while (right <= 7) {
            if (board[row][right] == 'B' || board[row][right] == 'P') {
                break;
            }
            if (board[row][right] == 'b' || board[row][right] == 'p') {
                found = found + 1;
                break;
            }
            right++;
        }
        return found;

    }

    private int findVertical(char board[][], int row, int col) {
        int up = row - 1;
        int down = row + 1;
        int found = 0;
        while (up >= 0) {
            if (board[up][col] == 'B' || board[up][col] == 'P') {
                break;
            }
            if (board[up][col] == 'b' || board[up][col] == 'p') {
                found = 1;
                break;
            }
            up--;
        }
        while (down <= 7) {
            if (board[down][col] == 'B' || board[down][col] == 'P') {
                break;
            }
            if (board[down][col] == 'b' || board[down][col] == 'p') {
                found = found + 1;
                break;
            }
            down++;
        }
        return found;

    }

}
