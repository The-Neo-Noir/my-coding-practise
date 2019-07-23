package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * <p>
 * Not as easy as it sounds. TODO: practise again .
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (head != null) {
            int currentVal = head.val;

            if (head.next != null && head.next.val == currentVal) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return temp;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
