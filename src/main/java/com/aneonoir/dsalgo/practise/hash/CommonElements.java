package com.aneonoir.dsalgo.practise.hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * link: https://practice.geeksforgeeks.org/problems/common-elements/0/
 * <p>
 * appraoch: struggle
 * <p>
 * tag: hashtable,hashmap, hashing, interview,
 * <p>
 * TODO: pretty slow performance, you need to code and see for a better solution.
 */
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a[] = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            TreeMap<Integer, Integer> st = new TreeMap<>();
            for (int i = 0; i < 3; i++) {
                Set<Integer> local = new HashSet<>();
                for (int j = 0; j < a[i]; j++) {
                    int sss = sc.nextInt();
                    local.add(sss);
                }

                for (Integer s : local) {
                    st.put(s, st.getOrDefault(s, 0) + 1);
                }

            }
            boolean matched = false;
            for (Integer s : st.keySet()) {
                if (st.get(s) == 3) {
                    matched = true;
                    System.out.print(s + " ");
                }
            }
            if (!matched) System.out.print("-1");
            System.out.println();

        }
    }
}