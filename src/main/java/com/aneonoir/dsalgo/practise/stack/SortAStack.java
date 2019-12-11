package com.aneonoir.dsalgo.practise.stack;

import java.util.Stack;

/**
 * link: https://practice.geeksforgeeks.org/problems/sort-a-stack/1
 * <p>
 * Used TreeMap , to sort and push it back on to the stack ?
 * <p>
 * TODO: See how can you do it without a space o(n)
 */
public class SortAStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> st = new Stack<>();
        java.util.TreeMap<Integer, Integer> map = new java.util.TreeMap<>();
        while (!s.isEmpty()) {
            Integer in = s.pop();
            map.put(in, map.getOrDefault(in, 0) + 1);
        }
        for (Integer in : map.keySet()) {
            int times = map.get(in);
            while (times-- > 0) {
                st.push(in);
            }
        }
        return st;

    }
}
