package com.aneonoir.dsalgo.practise.hash;

import java.util.HashSet;

/**
 * Finally solved it , but still slower,
 * <p>
 * Runtime: 4 ms, faster than 7.69% of Java online submissions for Happy Number.
 * Memory Usage: 35.5 MB, less than 6.06% of Java online submissions for Happy Number.
 * <p>
 * TODO: must find out how can this be faster.
 * <p>
 * tag: interview,math,hash
 */
public class HappyNumber {
    private int hashOfSquares[] = new int[10];
    private HashSet<Integer> s = new HashSet<>();
    private boolean breakByHit = false;

    public static void main(String ad[]) {
        System.out.println(new HappyNumber().isHappy(207));
    }

    public boolean isHappy(int n) {
        int calculatedValue = n;
        boolean ret = false;
        s.add(n);
        while (true) {
            int[] vals = extractDigits(calculatedValue);
            int total = 0;
            for (Integer integer : vals) {
                total = total + squre(integer);
            }
            if (total == 1) {
                ret = true;
                break;
            } else {
                if (!s.add(total)) {
                    ret = false;
                    break;
                }
            }
            calculatedValue = total;
        }

        return ret;

    }

    private int[] extractDigits(int number) {
        char a[] = String.valueOf(number).toCharArray();
        int[] result = new int[a.length];
        int counter = 0;
        for (char ch : a) {
            result[counter] = Integer.valueOf(ch + "").intValue();
            counter++;
        }
        return result;
    }

    private int squre(int digit) {
        if (digit == 0) return 0;
        if (hashOfSquares[digit] == 0) {
            return hashOfSquares[digit] = digit * digit;
        } else {
            return hashOfSquares[digit];
        }

    }

}