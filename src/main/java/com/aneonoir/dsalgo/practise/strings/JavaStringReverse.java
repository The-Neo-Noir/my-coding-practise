package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.equals(new StringBuilder(A).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
