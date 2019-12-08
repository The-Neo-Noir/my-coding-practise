package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/find-unique-element/0
 * <p>
 * struggled a bit, note that the idea of xor will not work here
 * tag: hashmap,interview,array
 */
public class FIndUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            HashMap<Integer, Integer> ms = new HashMap<>();
            for (int i = 0; i < a; i++) {
                int ss = sc.nextInt();
                ms.put(ss, ms.getOrDefault(ss, b) - 1);
            }
            for (Integer in : ms.keySet()) {
                if (ms.get(in) == b - 1) {
                    System.out.println(in);
                    break;
                }
            }
        }
    }
}
