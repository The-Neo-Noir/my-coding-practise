package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
 * <p>
 * apporach:
 * <p>
 * TODO: A Must to do , a tough one
 * <p>
 * tags: link,interview
 */
public class DeleteNodeHavingValueGreaterOnRight {

    public static void main(String[] args) {

        Node n = new Node(10);
        n.next = new Node(13);
        n.next.next = new Node(14);
        LinkedList linkedList = new LinkedList();
        linkedList.head = n;
        compute(linkedList);

    }

    static void compute(LinkedList l) {
        // 6 8 7
        //10 20 30 40 50 60

        // your code here
        Node head = l.head;
        Node prev = l.head;
        Node curr = l.head;
        while (curr != null) {
            boolean flag = false;
            if (curr.next != null && curr.value < curr.next.value) {
                prev.next = curr.next;
                if (l.head == curr) {
                    l.head = curr.next;
                    prev = curr.next;
                }
                flag = true;
            }
            if (!flag)
                prev = curr;
            curr = curr.next;
        }
    }

    static class LinkedList {
        Node head;
        // Member Methods
    }
}
