package com.aneonoir.dsalgo.practise.hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * link: https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not/0
 * <p>
 * tag: hashing, set,
 */
public class IsoGramString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Set<Character> s = new HashSet<>();
            String input = sc.next();
            int result = 1;
            for (Character ch : input.toCharArray()) {
                if (!s.add(ch)) {
                    result = 0;
                    break;
                }
            }
            System.out.println(result);
        }

    }
}
