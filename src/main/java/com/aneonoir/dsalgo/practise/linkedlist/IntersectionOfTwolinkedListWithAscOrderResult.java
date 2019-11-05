package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.HashSet;

/**
 * link:  https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1
 * <p>
 * tag: interview
 * stuggle: inserting node at the right place are a stuggle for me, Need to do more insertion sort and quick sort on linked list
 * <p>
 * TODO: STill not correct , need to fix it.
 */
public class IntersectionOfTwolinkedListWithAscOrderResult {
    public static void main(String[] args) {
        Node d = new Node(9);
        d.next = new Node(6);
        d.next.next = new Node(4);
        d.next.next.next = new Node(2);
        d.next.next.next.next = new Node(3);
        d.next.next.next.next.next = new Node(8);

        Node sd = new Node(1);
        sd.next = new Node(2);
        sd.next.next = new Node(8);
        sd.next.next.next = new Node(6);

        Node intersection = findIntersection(d, sd);

    }

    static Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();
        while (head1 != null) {
            set.add(head1.data);
            head1 = head1.next;
        }
        Node result = null;
        while (head2 != null) {
            if (set.contains(head2.data)) {
                if (result == null) {
                    result = new Node(head2.data);
                    insertInAscSort(result, null);
                } else {
                    insertInAscSort(result, new Node(head2.data));
                }

            }
            head2 = head2.next;
        }
        return result;
    }

    static void insertInAscSort(Node head, Node node) {
        Node prev = head;
        Node curr = head;
        if (node == null) {
            return;
        }
        boolean flag = false;
        while (curr != null) {

            if (node.data > prev.data && node.data < curr.data) {
                prev.next = node;
                node.next = curr;
                flag = true;
                break;
            }
            if (node.data < curr.data) {

                head = node;
                head.next = curr;
                flag = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (!flag) {
            prev.next = node;

        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
