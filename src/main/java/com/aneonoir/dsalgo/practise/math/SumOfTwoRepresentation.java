package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/loop-tunnel/hBw5BJiZ4LmXcy92u
 */
public class SumOfTwoRepresentation {


    @Test
    public void test() {
        countSumOfTwoRepresentations2(93, 24, 58);
    }

    int countSumOfTwoRepresentations2(int n, int l, int r) {
        int search = n - l;
        int temp = 0;
        int result = 0;

        if (search > r) {
            search = n - r;
            for (int k = l; k <= r; k++) {
                if (search == k) {
                    temp = k;
                    break;
                }
            }
            if (temp == 0) {
                result = 0;
            } else {
                result = ((r - temp) / 2) + 1;
            }
        } else {
            for (int k = r; k >= l; k--) {
                if (search == k) {
                    temp = k;
                    break;
                }
            }
            if (temp == 0) {
                result = 0;
            } else {
                result = ((temp - l) / 2) + 1;
            }
        }
        return result;
    }
}