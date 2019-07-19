package com.aneonoir.dsalgo.practise.hash;

/**
 * link: https://leetcode.com/problems/find-the-difference/submissions/
 */
public class FIndDIff {

//    public char findTheDifference(String s, String t) {
//        Set<Character> set= new HashSet<>();
//        s.chars().forEach(value -> set.add((char)value));
//
//    }

    public static void main(String[] args) {
        long reverse = reverse(1534236469);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        int multiplier = 1;
        if (x < 0) {
            multiplier = -1;
        }
        long finalNum = 0;
        int exp = new String((x * multiplier) + "").length() - 1;
        x = x * multiplier;
        boolean flag = true;
        while (x > 0) {
            finalNum = finalNum + (long) Math.pow(10, exp) * (x % 10);
            x = x / 10;
            exp--;
        }
        if (finalNum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) finalNum * multiplier;
    }


}
