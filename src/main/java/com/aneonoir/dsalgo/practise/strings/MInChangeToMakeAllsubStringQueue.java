package com.aneonoir.dsalgo.practise.strings;

import java.util.HashSet;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/minimum-changes-to-make-all-substrings-distinct/0
 * <p>
 * tags: string,hash,set
 */
public class MInChangeToMakeAllsubStringQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            String sdf = sc.next();
            System.out.println(call(sdf));
            cases--;
        }
    }

    private static int call(String ar) {
        HashSet<Character> s = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < ar.length(); i++) {
            boolean tet = s.add(ar.charAt(i));
            if (!tet) {
                sum++;
            }
        }
        return sum;
    }
}
