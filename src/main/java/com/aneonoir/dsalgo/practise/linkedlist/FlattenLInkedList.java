package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 * <p>
 * approach : Got most of it right, but a good practise problem
 * <p>
 * TODO: solved , but slow, ca you make it fast
 * tags: list,doublylinkedlist, interview
 */

public class FlattenLInkedList {


    public static void main(String[] args) {
        FlattenLInkedList flattenLInkedList = new FlattenLInkedList();


        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;


        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);

        Node n11 = new Node(11);
        Node n12 = new Node(12);

        n11.next = n12;
        n12.prev = n11;

        n7.next = n8;
        n8.prev = n7;

        n8.next = n9;
        n9.prev = n8;
        n8.child = n11;

        n10.prev = n9;
        n9.next = n10;

        n3.child = n7;
        Node flatten = flattenLInkedList.flatten(n1);


    }
    public Node flatten(Node head) {
        return flattenRecursive(head).head;
    }

    public Holder flattenRecursive(Node head) {
        Node movingHead = head;
        Node mergingHead = head;
        Node tail = head;
        Node childHead = null;
        while (movingHead != null) {

            if (movingHead.child != null) {
                childHead = movingHead;
                mergingHead = childHead.next;
                Holder holder = flattenRecursive(childHead.child);
                childHead.child = null;
                childHead.next = holder.head;

                holder.head.prev = childHead;
                if (mergingHead != null) {
                    mergingHead.prev = holder.tail;
                    holder.tail.next = mergingHead;
                }
            }
            if (movingHead.next == null) {
                tail = movingHead;
            }
            movingHead = movingHead.next;
        }

        return new Holder(head, tail);
    }

    private static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

    private class Holder {
        Node head;
        Node tail;

        Holder(Node head, Node tail) {
            this.head = head;
            this.tail = tail;
        }
    }


}
