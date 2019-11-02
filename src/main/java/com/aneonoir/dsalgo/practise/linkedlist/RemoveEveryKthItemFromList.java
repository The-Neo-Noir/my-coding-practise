package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/remove-every-kth-node/1
 */
public class RemoveEveryKthItemFromList {
    Node delete(Node head, int k) {
        if (k == 0) {
            return head;
        } else if (k == 1) {
            return null;
        } else {
            int count = 1;
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
                if (count == k - 1) {
                    prev.next = temp.next;
                    prev =temp= temp.next;
                    count = 1;
                    if (temp == null) {
                        break;
                    }
                } else {
                    count++;
                }
            }
        }
        return head;
    }
}
