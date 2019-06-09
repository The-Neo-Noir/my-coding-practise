package com.aneonoir.dsalgo.practise.bitwise;

import java.util.Scanner;


/**
 * link: https://www.hackerrank.com/challenges/maximizing-xor/problem
 */
public class MaximizingXOR {
    /*
     * Complete the function below.
     */

    static int maxXor(int l, int r) {
        int maxValue = -1;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                int temp = i ^ j;
                if (maxValue < temp)
                    maxValue = temp;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}

