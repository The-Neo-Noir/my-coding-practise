package com.aneonoir.dsalgo.practise.implementation;

import java.util.Scanner;

public class JavaLoopsTwo {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n; j++) {
                sb.append(calculate(a, b, j)).append(" ");

            }
            System.out.println(sb.toString());
        }
        in.close();


    }

    public static int calculate(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i <= n; i++) {
            sum += ((Math.pow(2, i) * b));
        }
        return sum;
    }
}

