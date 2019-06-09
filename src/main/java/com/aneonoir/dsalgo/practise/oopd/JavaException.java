package com.aneonoir.dsalgo.practise.oopd;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * link: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */
public class JavaException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            System.out.println(input1 / input2);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }

    }
}
