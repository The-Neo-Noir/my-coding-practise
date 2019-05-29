package com.aneonoir.dsalgo.practise.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * link: https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681/
 * <p>
 * First question: assume only even number of nodes are there and head is not null
 */
public class SwapListNodesInPairs {

    @Test
    public void testNullNOde() {

        //   head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);

        assertEquals(null, swapPairs(null));

    }

    @Test
    public void testSingleNode() {
        ListNode head = new ListNode(1);
        assertEquals(head, swapPairs(head));

    }

    @Test
    public void testDoubleNodes() {
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        ListNode head2Result = new ListNode(2);
        head2Result.next = new ListNode(1);
        assertEquals(head2Result, swapPairs(head2));
    }

    @Test
    public void testThreeNodes() {
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        ListNode head2Result = new ListNode(3);
        head2Result.next = new ListNode(2);
        head2Result.next.next = new ListNode(1);
        assertEquals(head2Result, swapPairs(head2));
    }

    @Test
    public void testFourNodes() {
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);


        ListNode head2Result = new ListNode(4);
        head2Result.next = new ListNode(3);
        head2Result.next.next = new ListNode(2);
        head2Result.next.next.next = new ListNode(1);
        assertEquals(head2Result, swapPairs(head2));
    }


    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else {
            if (head.next == null) {
                return head;
            } else {
                int temp = head.val;
                head.val = head.next.val;
                head.next.val = temp;
                if (head.next.next != null && head.next.next.next != null) {
                    return swapPairs(head.next.next);
                } else {
                    return head;
                }
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
