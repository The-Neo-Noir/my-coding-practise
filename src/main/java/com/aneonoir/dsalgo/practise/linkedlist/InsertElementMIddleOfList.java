package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1
 *
 * approach: solved it using two pointer technique,
 * can you use recursion and solve it ? TODO: use recursion to solve it .
 */
public class InsertElementMIddleOfList {
    public Node insertInMid(Node head, int data) {

        Node slow = head, fast = head;
        if (fast == null) {
            return null;
        } else {
            if (fast.next == null) {
                Node node = new Node(data);
                head.next = node;
                return head;
            } else {
                while (fast.next != null && fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                Node node = new Node(data);
                node.next = slow.next;
                slow.next = node;
                return head;
            }
        }


    }
}
