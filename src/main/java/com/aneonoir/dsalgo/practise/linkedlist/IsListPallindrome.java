package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

/**
 * link: https://app.codesignal.com/interview-practice/task/HmNvEkfFShPhREMn4/solutions
 * approach: is pretty simple , put the elements in the stack and pop and get the elements to check
 * but there was a catch, and the catch is that , two Integer objects needs to be equality check
 * must be .equals() not ==
 * <p>
 * if (!st.pop().equals(temp.value))  instead of st.pop()!=temp.value will give bad side effcts
 */
public class IsListPallindrome {

    public static void main(String[] args) {
        System.out.println(10 + (1 << 2));

        ListNode<Integer> i = new ListNode<>(1);
        i.next = new ListNode<>(1000000000);
        i.next.next = new ListNode<>(-1000000000);
        i.next.next.next = new ListNode<>(-1000000000);
        i.next.next.next.next = new ListNode<>(1000000000);
        i.next.next.next.next.next = new ListNode<>(1);
        isListPalindrome(i);
    }

    static boolean isListPalindrome(ListNode<Integer> l) {
        Stack<Integer> st = new Stack();
        ListNode<Integer> temp = l;
        while (l != null) {
            st.push(l.value);
            l = l.next;
        }
        boolean result = true;
        while (temp != null) {
            if (st.pop().equals(temp.value)) {
                result &= false;
                break;
            }
            temp = temp.next;
        }
        return result;
    }

    static class ListNode<T> {
        T value;
        ListNode<T> next;

        ListNode(T x) {
            value = x;
        }
    }

}
