package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
 * <p>
 * approach : Got most of it right, but a good practise problem
 * <p>
 * TODO: failed test cases
 * tags: list,doublylinkedlist, interview
 */

public class FlattenLInkedList {

    public Node flatten(Node head) {
        return flattenRecursive(head).head;
    }

    public Holder flattenRecursive(Node head) {
        Node tempHead = head;
        Node tempTail = head;
        Node child = null;
        while (tempHead != null) {
            tempTail = tempHead;
            if (tempHead.child != null) {
                child = tempHead;
            }
            tempHead = tempHead.next;
        }

        if (child != null) {

            Holder holder = flattenRecursive(child.child);
            Node tailPart = child.next;

            child.next = holder.head;
            holder.head.prev = child;
            if (tailPart == null) {
                tempTail = holder.tail;
            }
            holder.tail.next = tailPart;

            tailPart.prev = holder.tail;

            child.child = null;
            return new Holder(head, tempTail);

        } else {
            return new Holder(head, tempTail);
        }

    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {
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
