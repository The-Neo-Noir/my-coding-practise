package com.aneonoir.dsalgo.practise.java;

import java.util.Scanner;

public class Son {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 2; i <= in; i += 2) {

            System.out.print(i + " ");
        }
    }
}
