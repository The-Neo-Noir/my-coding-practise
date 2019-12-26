package com.aneonoir.dsalgo.practise.strings;

/**
 * link: https://practice.geeksforgeeks.org/problems/pangram-checking/1
 * <p>
 * iterative:
 * <p>
 * TODO: can you do with only one for loop ?
 * note: 97->a, 122->z, 65->a
 */
public class CheckPanagram {
    public static boolean checkPanagram(String s) {
        boolean ch[] = new boolean[26];
        for (Character c : s.toLowerCase().toCharArray()) {
            if (Character.isLowerCase(c)) ch[c % 97] = true;
        }
        boolean result = true;
        for (boolean bol : ch) {
            if (!bol) {
                result = false;
                break;
            }
        }
        return result;
    }
}