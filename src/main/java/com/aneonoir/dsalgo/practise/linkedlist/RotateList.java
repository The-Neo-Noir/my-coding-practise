package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * Link: https://leetcode.com/problems/rotate-list/
 * <p>
 * I started thinking bruteforce, but later I changed my mind to make the list as a circular list.
 * Struggle: a little bit of struggle in couting. I always, get this as trouble matic.
 * <p>
 * Faster solution.
 * But can you do it using bruteforce method.
 * Learning: when ever there is rotation involved the formula is size-(k%size)
 * TODO: a bruteforce
 * TODO: fast and slow pointer as in below.
 * <p>
 * Can you do it using slow and fast pointer ? https://leetcode.com/problems/rotate-list/discuss/22715/Share-my-java-solution-with-explanation
 * <p>
 * tags: list,linkedlist,rorate a list, interview
 */

public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode tail = head;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            tail = temp;
            size++;
            temp = temp.next;
        }
        tail.next = head;
        int itr = size - (k % size);
        temp = head;
        while (itr > 1) {
            temp = temp.next;
            itr--;
        }
        head = temp.next;
        temp.next = null;

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
