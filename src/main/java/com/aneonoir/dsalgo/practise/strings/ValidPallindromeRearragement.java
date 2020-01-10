package com.aneonoir.dsalgo.practise.strings;

import java.util.HashMap;

/**
 * link: https://app.codesignal.com/challenge/P6bQYaobCb8f3j4Zy
 *
 * level: medium
 *
 * learning: when the characters are even, then all the number of occurances of characters must be even, if threr
 * are odd charaters, then only one of the character occurances must be odd, and all others have to be even.
 *
 *
 * tag: hash, interview, practise, string, palindrome.
 *
 * TODO: can you do it without extra memory ?
 *
 */
public class ValidPallindromeRearragement {

    boolean isPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int fullsize = map.keySet().size();
        int evenCount = 0, oddCount = 0;
        for (Character ch : map.keySet()) {
            if (map.get(ch) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (s.length() % 2 == 0) {
            if (oddCount == 0 && evenCount == fullsize) {
                return true;
            } else {
                return false;
            }

        } else {
            if (oddCount == 1 && evenCount == fullsize - 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
