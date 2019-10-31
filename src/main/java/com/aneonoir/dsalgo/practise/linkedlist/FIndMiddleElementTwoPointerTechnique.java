package com.aneonoir.dsalgo.practise.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIndMiddleElementTwoPointerTechnique {
    // Function to find middle element a linked list

    int getMiddle(Node head) {
        Node slow = head;
        Node fast = slow;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    @Test
    public void evenNumberedLinkedList() {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node2.addNode(node3);
        node1.addNode(node2);
        node.addNode(node1);
        int middleElement = getMiddle(node);
        assertEquals(2, middleElement);

    }
}
