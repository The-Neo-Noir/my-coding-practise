package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
 */
public class RemoveLoopinLinkedList {

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = n.next;

        removeTheLoop(n);
    }

    public static void removeTheLoop(Node head) {

        boolean isLoopFound = false;
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isLoopFound = true;
                break;
            }
        }


        if (isLoopFound) {
            slow.next = null;
            // System.out.println("1");
        } else {
            //  System.out.println("0");
        }
    }

}
//  f .
//1 2 3 2