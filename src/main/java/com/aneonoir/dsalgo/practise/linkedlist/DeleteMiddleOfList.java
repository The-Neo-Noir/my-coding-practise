package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
 * <p>
 * solution: used slow and fast pointer , and maintaned a prev node to achieve it.
 */
public class DeleteMiddleOfList {

    Node Delete(Node head) {

        Node slow = head, fast = head;
        Node prev = slow;
        while (slow != null && fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        slow = null;
        return head;
    }

}
