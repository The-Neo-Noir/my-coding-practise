package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1
 * <p>
 * approach: messed up , took a lot of time and still could not solve it.
 * <p>
 * TODO:
 * tags: list, linkedlist, pairwise swap, interview
 */
public class PairWiseSwap {
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
}
