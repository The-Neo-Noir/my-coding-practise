package com.aneonoir.dsalgo.practise.bitwise;

import java.util.ArrayList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/circular-permutation-in-binary-representation/
 * todo: improve the performace
 * <p>
 * tag: interview, medium, bitwise, grey code.
 */
public class CircularPermutationInBinaryRepresentation {
    public List<Integer> circularPermutation(int n, int start) {
        int j = 0;
        List<Integer> list = new ArrayList<>((int) Math.pow(2, n));
        boolean jset = false, shouldAdd = false;
        ;
        for (int i = 0; i < Math.pow(2, n); i++) {
            String grey = greyCode(i);
            int val = Integer.parseInt(grey, 2);
            if (start == val) {
                if (!jset) {
                    j = i;
                }
                jset = true;
                shouldAdd = true;
            }
            if (shouldAdd) list.add(val);
        }
        for (int i = 0; i < j; i++) {
            list.add(Integer.parseInt(greyCode(i), 2));
        }
        return list;
    }

    private static String greyCode(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";

        String asd = Integer.toBinaryString(n);
        StringBuilder result = new StringBuilder(asd.charAt(0) + "");
        for (int i = 1; i < asd.length(); i++) {
            result.append(((Integer.parseInt(asd.charAt(i) + "") ^ Integer.parseInt(asd.charAt(i - 1) + "")) + ""));
        }
        return result.toString();
    }
}

