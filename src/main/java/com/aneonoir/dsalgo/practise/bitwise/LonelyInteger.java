package com.aneonoir.dsalgo.practise.bitwise;

/**
 * link: https://www.hackerrank.com/challenges/lonely-integer/problem
 */

import java.util.*;

public class LonelyInteger {
    static Set<Integer> s = new HashSet<Integer>();
    static List<Integer> al = new ArrayList<Integer>();

    static int lonelyinteger() {
        s.addAll(al);
        int returnval = 0;
        for (Integer i : s) {
            if (Collections.frequency(al, i) == 1) {
                returnval = i;
            }
        }
        return returnval;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
            al.add(_a_item);
        }

        res = lonelyinteger();
        System.out.println(res);

    }
}
