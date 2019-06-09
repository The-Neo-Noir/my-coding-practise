package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://app.codesignal.com/interview-practice/task/APDXraJZYfPSYqQMJ
 */
public class SingleNumber {
    int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }

}
