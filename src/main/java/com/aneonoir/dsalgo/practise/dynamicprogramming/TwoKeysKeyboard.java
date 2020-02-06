package com.aneonoir.dsalgo.practise.dynamicprogramming;

/**
 * approach:
 * <p>
 * tag: dynamic programming, dp , interview, medium, struggle,
 */
public class TwoKeysKeyboard {
    public int minSteps(int n) {
        int result[] = new int[n + 1];
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 3;
        } else {
            result[0] = 0;
            result[1] = 1;
            result[2] = 2;
            result[3] = 3;
            for (int i = 4; i <= n; i++) {
                if (i % 2 == 0) {
                    result[i] = result[i / 2] + 2;
                } else {
                    s(i, i, result);
                }
            }
            return result[n];
        }
    }

    private void s(int n, int i, int result[]) {
        int prime = -1;
        for (int j = 3; j < i; j++) {
            if (i % j == 0) {
                prime = j;
                result[n] += result[j];
                break;
            }
        }
        if (prime == -1) {
            result[n] = result[n] + i;
        } else {
            s(n, i / prime, result);
        }

    }
}
