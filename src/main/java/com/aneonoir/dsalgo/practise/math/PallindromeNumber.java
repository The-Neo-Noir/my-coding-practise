package com.aneonoir.dsalgo.practise.math;

import java.util.LinkedList;
import java.util.List;

/**
 * link:https://leetcode.com/problems/palindrome-number/
 * <p>
 * approach: Using String is pretty trivial, so wanted to solve it mathematically.
 * But I used two loops to do that , can you use a single loop to solve it. I believe there is a possiblility
 * TODO:
 * TODO can you solve it recursively .
 */
public class PallindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            return check(x);
        }
    }

    boolean check(int num) {
        List<Integer> list = new LinkedList<>();
        int temp = num;
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += ((int) Math.pow(10, list.size() - i - 1) * list.get(i));
        }
        return temp == result;
    }
}
