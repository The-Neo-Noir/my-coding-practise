package com.aneonoir.dsalgo.practise.linkedlist.circular;

import com.aneonoir.dsalgo.practise.linkedlist.Node;

/**
 * 01/01/20 3:26 PM
 * link: https://practice.geeksforgeeks.org/problems/circular-linked-list/1

 * TODO: can you do it recursively ?
 *
 * testing agian
 */
public class CheckIfACircularList {
    public boolean isCircular(Node node) {
        if (node == null) return true;
        Node temp = node;
        boolean result = false;
        while (node != null) {
            if (node.next == temp) {
                result = true;
                break;
            }
            node = node.next;
        }
        return result;
    }
}
