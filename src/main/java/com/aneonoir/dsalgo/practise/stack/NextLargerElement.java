package com.aneonoir.dsalgo.practise.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * link: https://practice.geeksforgeeks.org/problems/next-larger-element/0
 * <p>
 * approach: ;use a stack, but i failed mesireabley.
 * <p>
 * TODO: A must todo , still failing test cases.
 * tag: stack, interview
 */
public class NextLargerElement {
    static class Node {
        int ans;
        int val;
        int max;

        Node(int ans, int val, int max) {
            this.ans = ans;
            this.val = val;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int a[] = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            callme(a);
            System.out.println();
        }
    }

    private static void callme(int[] a) {
        Stack<Node> st = new Stack<>();
        st.push(new Node(-1, a[a.length - 1], a[a.length - 1]));
        for (int i = a.length - 2; i >= 0; i--) {
            int max = Math.max(a[i], st.peek().max);
            int ans = 0;
            if (a[i] > st.peek().max) {
                ans = -1;
            } else {
                if (a[i] < st.peek().val && st.peek().val <= st.peek().max) {
                    ans = st.peek().val;

                } else {
                    if (a[i] <= Math.min(st.peek().ans, st.peek().max)) {
                        ans = st.peek().ans;
                    } else {
                        ans = st.peek().max;
                    }
                }
            }
            int val = a[i];
            st.push(new Node(ans, val, max));
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop().ans + " ");
        }
    }
}