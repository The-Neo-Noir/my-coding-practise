package com.aneonoir.dsalgo.practise.array;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/non-repeating-element/0
 * <p>
 * TODO: should there be any trick try see how others are doing
 */
public class FirstNonRepeatingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            LinkedHashMap<Long, Integer> map = new LinkedHashMap<>();
            while (n-- > 0) {
                long in = sc.nextLong();
                map.put(in, map.getOrDefault(in, 0) + 1);
            }
            long result = 0;
            for (Long m : map.keySet()) {
                if (map.get(m) == 1) {
                    result = m;
                    break;
                }
            }
            System.out.println(result);
        }

    }
}
