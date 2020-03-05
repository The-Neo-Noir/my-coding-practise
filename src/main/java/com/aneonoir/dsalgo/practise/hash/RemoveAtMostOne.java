package com.aneonoir.dsalgo.practise.hash;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * link: https://practice.geeksforgeeks.org/problems/check-frequencies/0
 *
 * approach: I have been doing it wrong. There are so many edge and corner cases  TODO: do it again,
 *
 *
 * tag: hashmap, frequency, remove , interview. struggle
 */
public class RemoveAtMostOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            HashMap<Character, Integer> map = new HashMap<>();
            String sd = sc.next();
            for (Character ch : sd.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            TreeMap<Integer, Integer> ms = new TreeMap<>();
            for (Integer in : map.values()) {
                ms.put(in, ms.getOrDefault(in, 0) + 1);
            }
            if (ms.size() == 2) {
                int a[] = new int[2];
                int i = 0;
                for (Integer m : ms.keySet()) {
                    a[i++] = m;
                }
                // System.out.println(ms);
                if (a[1] - a[0] == 1 && ms.get(a[1]) == 1) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println("0");
            }
        }

    }
}
