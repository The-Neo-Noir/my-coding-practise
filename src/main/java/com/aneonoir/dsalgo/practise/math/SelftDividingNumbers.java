package com.aneonoir.dsalgo.practise.math;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/self-dividing-numbers/
 * <p>
 * approach: a pretty bruteforce TODO: should there be a better way to solve it.There is hint provided
 * <p>
 * TODO: check the hint
 */
public class SelftDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int number) {
        if (number <= 9) {
            return true;
        } else {

            List<Integer> digits = getAllDigits(number);
            boolean result = true;
            for (int i = 0; i < digits.size(); i++) {
                if (digits.get(i) == 0 || number % digits.get(i) != 0) {
                    result = false;
                    break;
                }
            }
            return result;
        }
    }

    private List<Integer> getAllDigits(int number) {
        List<Integer> digitsList = new LinkedList<>();
        while (number > 0) {
            digitsList.add(number % 10);
            number = number / 10;
        }

        return digitsList;
    }

}