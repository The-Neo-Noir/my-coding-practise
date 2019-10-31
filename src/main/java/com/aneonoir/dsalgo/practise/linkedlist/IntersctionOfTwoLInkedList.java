package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

public class IntersctionOfTwoLInkedList {

    int intersectPoint(Node headA, Node headB) {
        Stack<Integer> headAs = new Stack();
        Stack<Integer> headBs = new Stack();
        while (headA != null) {
            headAs.push(headA.value);
            headA = headA.next;
        }
        while (headB != null) {
            headBs.push(headB.value);
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
