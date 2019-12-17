package com.aneonoir.dsalgo.practise.math;

import java.util.LinkedList;

/**
 * link: https://www.lintcode.com/problem/calculate-number/description
 * <p>
 * easy question but i struggled as I misundertood the question .
 * <p>
 * tag: math, binary,array
 */

public class CalculateNumber {
    public static void main(String[] args) {
        CalculateNumber calculatenumber = new CalculateNumber();
        calculatenumber.calculateNumber(10);
    }

    public int[] calculateNumber(int num) {
        int count = 0;
        int nu = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while (num > 0) {
            if (num % 2 == 1) {
                list.addFirst(count);
                nu++;
            }
            num /= 2;
            count++;
        }
        int result[] = new int[1 + list.size()];
        result[0] = nu;
        for (int i = 1; i < list.size() + 1; i++) {
            result[i] = count - list.get(i - 1);
        }
        return result;
    }
}
