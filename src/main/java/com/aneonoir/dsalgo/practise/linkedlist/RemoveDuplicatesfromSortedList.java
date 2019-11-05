package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * link: https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1/?ref=self
 * <p>
 * Not as easy as it sounds. TODO: practise again .
 */
public class RemoveDuplicatesfromSortedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        deleteDuplicates(head);
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (head != null) {
            int currentVal = head.val;
            ListNode current = head.next;
            while (current != null && current.val == currentVal) {
                current = current.next;
            }
            head.next = current;
            head = head.next;
        }
        return temp;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
