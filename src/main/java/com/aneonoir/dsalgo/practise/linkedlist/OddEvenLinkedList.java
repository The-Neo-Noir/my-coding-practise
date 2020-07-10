package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**K
 * link:
 * <p>
 * I used a queue , this might be a cheat. Can you do it better. ?
 * <p>
 * Runtime: 1 ms, faster than 22.56% of Java online submissions for Odd Even Linked List.
 */
public class OddEvenLinkedList {
    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode oddEvenList(ListNode head) {
        ListNode headTemp = head;
        ListNode twoSkip = head;
        if (head != null) {
            Queue<ListNode> nodes = new LinkedList<>();
            ListNode prev = null;
            while (twoSkip != null && twoSkip.next != null) {
                nodes.add(twoSkip.next);
                prev = twoSkip;
                twoSkip = twoSkip.next.next;
                prev.next = twoSkip;
            }
            if (twoSkip == null) twoSkip = prev;
            ListNode mover = twoSkip;
            for (ListNode n : nodes) {
                mover.next = n;
                mover = n;

            }
            mover.next = null;
        }
        return headTemp;
    }
}
