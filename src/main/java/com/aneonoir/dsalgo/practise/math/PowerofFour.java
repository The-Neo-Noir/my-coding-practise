package com.aneonoir.dsalgo.practise.math;

public class PowerofFour {
    public boolean isPowerOfFour(int num) {
        if (num == 0)
            return false;
        if ((num & (num - 1)) == 0) {
            int count = 0;
            while ((num & 1) != 1) {
                count++;
                num = num >> 1;
            }
            return count % 2 == 0;
        } else {
            return false;
        }
    }
}
