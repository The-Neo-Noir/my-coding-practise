package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

public class PalindormeListCheckUsingStack {
    boolean isPalindrome(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while (head != null) {
            st.push(head);
            head = head.next;
        }
        boolean isPallindrome = true;
        while (temp != null) {
            if (st.pop().value != temp.value) {
                isPallindrome = false;
                break;
            }
            temp = temp.next;
        }
        return isPallindrome;
    }
}
