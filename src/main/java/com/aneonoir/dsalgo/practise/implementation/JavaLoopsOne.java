package com.aneonoir.dsalgo.practise.implementation;

import java.util.Scanner;

public class JavaLoopsOne {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
    }
}
