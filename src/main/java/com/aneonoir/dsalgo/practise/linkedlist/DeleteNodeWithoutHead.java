package com.aneonoir.dsalgo.practise.linkedlist;

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
