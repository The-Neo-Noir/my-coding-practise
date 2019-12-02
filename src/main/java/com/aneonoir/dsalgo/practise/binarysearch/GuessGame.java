package com.aneonoir.dsalgo.practise.binarysearch;

/**
 * link: https://leetcode.com/problems/guess-number-higher-or-lower/solution/
 * <p>
 * TODO: not that easy , I got time
 * <p>
 * There is a ternary search ???? Where am I living , I need to gear up .
 * <p>
 * Still buggy , need to finish it .
 * TODO: see the solution section , there are a lot to learn
 * <p>
 * tag: binary search, interview.
 */
public class GuessGame {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();


        int i = guessGame.guessNumber(2126753390);
        System.out.println(i);
    }

    private int guess(int pass) {
        return 1702766719 - pass;
    }

    private long guessNumbe(long n) {
        long low = 1;
        long high = n;
        long result = -1;
        while (low <= high) {
            long pass = (low + high) / 2;
            int guess = guess((int) pass);
            if (guess == 0) {
                result = pass;
                break;
            } else if (guess == 1) {
                low = pass + 1;
            } else {
                high = pass - 1;
            }
        }
        return result;
    }

    public int guessNumber(int n) {
        return (int) guessNumbe(n);
    }
}
