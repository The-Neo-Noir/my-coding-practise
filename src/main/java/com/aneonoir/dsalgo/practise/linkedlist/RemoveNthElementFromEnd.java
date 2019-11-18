package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * solution: i used two loop;s
 * <p>
 * TODO: Use fast pointer.
 * <p>
 * tags: interview,list,remove element from lsit,
 */
public class RemoveNthElementFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int itr = size - (n % size);
        temp = head;
        while (itr > 1) {
            temp = temp.next;
            itr--;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
        else
            head = null;
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
