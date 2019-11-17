package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/merge-two-sorted-lists
 * approach: keep pointer to both , move the one which gets added to the final list. careful about the length of the
 * <p>
 * struggle: keeping track of the tail node of the newly created data.
 * <p>
 * note: it performed very slow, TODO: can you do it recursively, ?
 * <p>
 * <p>
 * tags: list,linkedlist,merge sort, interview
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null, n = null;
        while (l1 != null & l2 != null) {
            if (l1.val == l2.val) {
                if (head == null) {
                    head = n = new ListNode(l2.val);
                    n.next = new ListNode(l2.val);
                    n = n.next;
                } else {
                    n.next = new ListNode(l2.val);
                    n = n.next;
                    n.next = new ListNode(l2.val);
                    n = n.next;
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1.val > l2.val) {
                if (head == null) {
                    head = n = new ListNode(l2.val);
                } else {
                    n.next = new ListNode(l2.val);
                    n = n.next;
                }
                l2 = l2.next;
            } else {
                if (head == null) {
                    head = n = new ListNode(l1.val);
                } else {
                    n.next = new ListNode(l1.val);
                    n = n.next;
                }
                l1 = l1.next;
            }
        }
        if (l1 == null) {
            if (head == null) {
                head = l2;
            } else {
                n.next = l2;
            }
        }
        if (l2 == null) {
            if (head == null) {
                head = l1;
            } else {
                n.next = l1;
            }
        }
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
