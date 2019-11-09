package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link:    https://practice.geeksforgeeks.org/problems/count-substrings/0
 * <p>
 * approach: its intimidating at first , but once you can figure out the mathematics behind it , its super easy .
 * you can solve it O(n) n, being the size of the string.
 * <p>
 * Bruteforce : can you solve it using bruteforce ?
 * <p>
 * tag: string, mathematics, couting, interview.
 * TODO: Try again.
 */
public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String sadf = sc.next();
            int counter = 0;
            for (int i = 0; i < sadf.length(); i++) {
                if (sadf.charAt(i) == '1') {
                    counter++;
                }
            }
            System.out.println((counter * (counter - 1) / 2));
        }
    }
}
