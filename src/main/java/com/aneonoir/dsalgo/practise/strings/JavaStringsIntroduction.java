package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */
public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        A = (A.charAt(0) + "").toUpperCase() + A.subSequence(1, A.length());
        B = (B.charAt(0) + "").toUpperCase() + B.subSequence(1, B.length());
        System.out.printf("%s %s", A, B);
    }
}

