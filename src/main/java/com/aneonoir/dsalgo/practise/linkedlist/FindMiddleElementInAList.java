package com.aneonoir.dsalgo.practise.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * source: https://github.com/RefactoringGuru/refactoring-examples
 * <p>
 * tags:
 * recursion,linkedlist,bruteforce
 * approach: Method 1
 * 1. find the size of the nodes
 * 2. Iterate till you match the item by diving the
 *  Method 2:
 *  Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
 *  When the fast pointer reaches end slow pointer will reach middle of the linked list.
 *
 * <p>
 * struggle:
 * why I struggled to find the mid elememnt. I wrongly assume the index based on 1 , that made me do it wrong .
 * <p>
 * <p>
 * <p>
 * TODO:
 * 1 can you modify the the calculateSize method to findout the mid of the array list
 * 2. Can you achieve the method 2 mentioned above ?
 */
public class FindMiddleElementInAList {

    private static int getMiddleElement(Node node) {
        int count = 1;
        int size = calculateSize(node, count);

        int middle = size / 2;

        int counter = 0;
        int middleElement = 0;
        while (node.getNextNode() != null) {
            if (counter == middle) {
                middleElement = node.getValue();
                break;
            } else {
                node = node.getNextNode();
                counter++;
            }
        }
        return middleElement;
    }

    private static int calculateSize(Node node, int count) {
        if (node.getNextNode() == null) {
            return count;
        } else {
            return calculateSize(node.getNextNode(), count + 1);
        }
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
        int middleElement = getMiddleElement(node);
        assertEquals(2, middleElement);

    }

    @Test
    public void oddNumberdLinkedList() {

        Node node = new Node(0);
        Node node1 = new Node(1);

        Node node2 = new Node(2);

        node2.addNode(null);
        node1.addNode(node2);
        node.addNode(node1);
        int middleElement = getMiddleElement(node);
        assertEquals(1, middleElement);
    }

}

