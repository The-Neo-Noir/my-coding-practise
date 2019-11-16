package com.aneonoir.dsalgo.practise.array;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * link: https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form/0
 * <p>
 * tags: hashing,array,treemap,interview,sorting
 */
public class ConvertAnArrayToReducedForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int input[] = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();

            }
            reduced(input);
            System.out.println();

        }
    }

    private static void reduced(int ip[]) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < ip.length; i++) {
            map.put(ip[i], i);
        }
        int counter = 0;
        for (Integer s : map.keySet()) {
            map.put(s, counter);
            counter++;
        }
        for (int i = 0; i < ip.length; i++) {
            System.out.print(map.get(ip[i]) + " ");
        }
    }
}
