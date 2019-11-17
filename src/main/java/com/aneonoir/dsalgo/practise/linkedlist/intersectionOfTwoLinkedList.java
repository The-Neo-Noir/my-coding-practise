package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * <p>
 * approach: brueforce: O(mn) , get one element and iterate throught the rest
 * <p>
 * approach: Using hashing
 * <p>
 * approach: use ppointer that once reaches to end, should point the other list and continue till they match, if match found
 * then that the intersection.
 * <p>
 * tags: interview, list,linkedlist,intersection of list
 * <p>
 * TODO: ALL needs to be doen, againe, this code is messy.
 * <p>
 * larning: never do like this
 * <p>
 * <p>
 * *                tA=headB;
 * lastA=tA;
 * well the above code the tA data is lost.  instead do like below.
 * lastA=tA;
 * tA=headB;
 */
public class intersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tA = headA;
        ListNode tB = headB;
        ListNode result = null;
        ListNode lastA = headA, lastB = headB;
        while (tA != null && tB != null) {
            if (tA == tB) {
                result = tA;
                break;
            }
            if (tA.next == null) {
                lastA = tA;
                tA = headB;
                if (lastA != headA && lastB != headB) {
                    if (lastA != lastB) {
                        result = null;
                        break;
                    }
                }
            } else {
                tA = tA.next;
            }
            if (tB.next == null) {
                lastB = tB;
                tB = headA;
                if (lastA != headA && lastB != headB) {
                    if (lastA != lastB) {
                        result = null;
                        break;
                    }
                }
            } else {
                tB = tB.next;
            }
        }
        return result;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
