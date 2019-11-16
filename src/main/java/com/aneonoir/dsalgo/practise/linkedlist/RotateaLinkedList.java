package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
 * <p>
 * approach: is pretty simple, but still struggle for differnet cases
 * <p>
 * tags: list,linkedlist,singlylinkedlist, interview
 */
public class RotateaLinkedList {

    public Node rotate(Node head, int k) {
        int count = 1;

        Node temp = head;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            return head;
        } else {
            Node toBeTail = temp;
            if (toBeTail.next == null) {
                return head;
            } else {
                Node newHead = toBeTail.next;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = head;
                toBeTail.next = null;
                return newHead;
            }
        }

    }
}
