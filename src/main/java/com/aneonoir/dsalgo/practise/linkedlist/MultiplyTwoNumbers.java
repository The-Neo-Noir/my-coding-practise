package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

/**
 * link: https://www.lintcode.com/problem/multiply-two-numbers/description
 * <p>
 * approach: used two stacks, and made number out of that.
 * <p>
 * Can you do it without using stack ?  May be recursively /
 * <p>
 * TODO:
 * tag: linked list , math , multiplication
 */
public class MultiplyTwoNumbers {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the product list of l1 and l2
     */
    public long multiplyLists(ListNode l1, ListNode l2) {
        int num1 = 0, num2 = 0;
        Stack<Integer> st = new Stack<>();
        while (l1 != null) {
            st.push(l1.val);
            l1 = l1.next;
        }
        int count = 0;
        while (!st.isEmpty()) {
            num1 += (st.pop() * (int) Math.pow(10, count));
            count++;
        }
        while (l2 != null) {
            st.push(l2.val);
            l2 = l2.next;
        }
        count = 0;
        while (!st.isEmpty()) {
            num2 += (st.pop() * (int) Math.pow(10, count));
            count++;
        }

        return (long) num1 * num2;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
