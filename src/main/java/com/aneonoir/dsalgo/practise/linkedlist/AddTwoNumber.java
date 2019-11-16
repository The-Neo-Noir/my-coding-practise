package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/add-two-numbers/
 * <p>
 * Approach: find the size of both, taken the bigger sized list and add. Catch worry about carry overs
 */
public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sizeL1 = 0;
        int sizeL2 = 0;
        ListNode headL1 = l1;
        ListNode headL2 = l2;

        while (l1 != null) {
            sizeL1++;
            l1 = l1.next;
        }
        while (l2 != null) {
            sizeL2++;
            l2 = l2.next;
        }
        ListNode driver, ref = null;
        if (sizeL1 > sizeL2) {
            driver = headL1;
            ref = headL2;
        } else {
            driver = headL2;
            ref = headL1;
        }
        int carry = 0;
        ListNode head = null;
        ListNode result = null;
        while (driver != null) {
            int small = 0;
            if (ref != null) {
                small = ref.val;
            }
            int num = driver.val + small + carry;
            if (num > 9) {
                carry = num / 10;
                num = num % 10;
            } else {
                carry = 0;
            }
            if (head == null) {
                head = new ListNode(num);
                result = head;
            } else {
                head.next = new ListNode(num);
                head = head.next;
            }
            driver = driver.next;
            if (ref != null) {
                ref = ref.next;
            }
        }
        if (carry != 0) {
            head.next = new ListNode(carry);
        }
        return result;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}