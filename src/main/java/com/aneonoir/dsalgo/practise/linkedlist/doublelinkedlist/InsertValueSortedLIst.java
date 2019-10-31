package com.aneonoir.dsalgo.practise.linkedlist.doublelinkedlist;

/**
 * TODO:
 */
public class InsertValueSortedLIst {
    public static void main(String[] args) {
        Node node = new Node(3);
        Node node5 = new Node(5);
        node.next = node5;
        node5.prev = node;
        Node next8 = new Node(8);
        node5.next = next8;
        next8.prev = node5;

        int value = 6;
        insertValueInList(node, value);
        while (node != null) {
            System.out.println(node.data);
            node = node.next;

        }
    }

    // Case begining
    // middle
    // end;


    private static void insertValueInList(Node node, int value) {
        Node head = node;
        while (node != null) {
            if (node.prev == null) {
                if (value <= node.data) {
                    Node newNode = new Node(value);
                    newNode.next = node;
                    node.prev = newNode;
                    head = newNode;
                    break;
                }
            } else {
                if (value > node.prev.data && value <= node.data) {
                    Node newNode = new Node(value);

                    newNode.prev = node.prev;
                    newNode.next = node;

                    node.prev.next = newNode;
                    node.prev = newNode;
                    break;
                }
                if (true) {
                    Node next = new Node(value);
                    node.next = next;
                    next.prev = node;
                    break;
                }
            }
            node = node.next;
        }

    }
}
