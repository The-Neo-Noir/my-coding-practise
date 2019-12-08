package com.aneonoir.dsalgo.practise.math;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits/0
 * <p>
 * NOte: A number is divisible by 3 if all the digits in the number added togather is also divisible.
 */
public class FormANumberDisivibleByThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
            }
            String result = checkDisibile(input) % 3 == 0 ? "1" : "0";
            System.out.println(result);
        }
    }

    private static int checkDisibile(int input[]) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 9) {
                sum += input[i];
            } else {
                sum += sumOfDigits(input[i]);
            }
        }
        return sum;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
