package com.aneonoir.dsalgo.practise.array;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/add-to-array-form-of-integer/
 *
 *
 * approach: pretty brueteforce,
 *
 * gothcas: make sure your array index is protected. make the carry reset to 0
 *
 * tag: interview, array , list , numerical addition, math, easy
 *
 *
 */
public class AddToArrayFormOfInteger {


    public List<Integer> addToArrayForm(int[] A, int K) {
        int carry = 0;
        LinkedList<Integer> list = new LinkedList<>();
        int index = A.length - 1;
        while (K > 0) {
            int v = K % 10;
            K = K / 10;
            int va = 0;
            if (index >= 0) {
                va = A[index--];
            }
            int sum = carry + va + v;
            int value = sum % 10;
            if (sum > 9) {
                carry = sum / 10;
            } else {
                carry = 0;
            }
            ;
            list.addFirst(value);
        }
        for (int i = index; i >= 0; i--) {
            int sum = A[i] + carry;
            if (sum > 9) {
                carry = sum / 10;
            } else {
                carry = 0;
            }
            ;
            list.addFirst(sum % 10);
        }
        if (carry > 0) {
            list.addFirst(carry);
        }
        return list;
    }
}