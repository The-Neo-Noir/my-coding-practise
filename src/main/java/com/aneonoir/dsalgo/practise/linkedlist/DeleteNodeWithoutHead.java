package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
 *
 */
public class DeleteNodeWithoutHead {

    void deleteNode(Node node) {
        Node prev = node;
        while (node != null) {
            if (node.next != null) {
                node.value = node.next.value;
            } else {
                node = null;
                prev.next = node;
                break;
            }
            prev = node;
            node = node.next;
        }
    }

}
