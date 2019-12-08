package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/repetitive-addition-of-digits/0
 * <p>
 * solved in single shot.
 */
public class RepeatativeAdditionOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int input = sc.nextInt();
            int sum = 0;
            while (input > 9) {
                while (input > 0) {
                    sum += (input % 10);
                    input = input / 10;
                }
                if (sum > 9) {
                    input = sum;
                    sum = 0;
                } else {
                    input = sum;
                    break;
                }
            }
            System.out.println(input);

        }
    }
}
