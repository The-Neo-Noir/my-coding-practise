package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

/**
 * link: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
 * <p>
 * Todo: follow up don't use extra space
 */
public class InsertionPoint {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class LinkedList {
        Node head;  // head of list
    }

    class Intersect {
        int intersectPoint(Node headA, Node headB) {
            Stack<Integer> headAs = new Stack();
            Stack<Integer> headBs = new Stack();
            while (headA != null) {
                headAs.push(headA.data);
                headA = headA.next;
            }
            while (headB != null) {
                headBs.push(headB.data);
                headB = headB.next;
            }
            int last = 0;
            while (headBs.size() > 1) {
                Integer temp = headAs.pop();
                if (temp.equals(headBs.pop())) {
                    last = temp;
                } else {
                    break;
                }
            }
            return last;
        }
    }

}
