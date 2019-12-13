package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1
 * <p>
 * approach: messed up , took a lot of time and still could not solve it. iterative is solved.
 * <p>
 * TODO:
 * tags: list, linkedlist, pairwise swap, interview
 */
public class PairWiseSwap {

    /**
     * TODO: recursion is still not done.
     *
     * @param node
     * @return
     */
    public static Node pairwiseSwap(Node node) {
        Node curr = node, succ = node;
        if (curr == null) {
            return null;
        } else {
            Node sucnext = node, prev = node;
            int counter = 0;
            while (curr != null && curr.next != null) {
                sucnext = curr.next.next;
                curr.next.next = curr;// 2->1
                if (counter == 0) {
                    node = curr.next;
                }
                curr.next = sucnext; //1->null;
                if (counter != 0) {
                    prev.next = curr.next;
                }
                prev = curr;
                curr = sucnext;

                counter++;
            }
            return node;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode x = head;
        ListNode y = null;
        ListNode pre = null;
        boolean first = true;
        while (x != null) {
            y = x.next;
            if (y == null) break;
            x.next = y.next;
            y.next = x;
            if (first) {
                head = y;
            }
            if (pre != null) {
                pre.next = y;
            }
            first = false;
            pre = x;
            x = x.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
