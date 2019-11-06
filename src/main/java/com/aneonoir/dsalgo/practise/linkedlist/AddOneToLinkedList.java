package com.aneonoir.dsalgo.practise.linkedlist;

public class AddOneToLinkedList {
    // 123
    // 129
    //     9

    public static void main(String[] args) {
        Node node = new Node(9);
        //  node.next = new Node(9);
        Node node1 = addOne(node);

    }

    public static int recursiveAdd(Node head) {
        if (head.next == null) {
            if ((head.value + 1) > 9) {
                head.value = 0;
                return 1;
            } else
                return 0;
        } else {
            int data = head.value = head.value + recursiveAdd(head.next);
            if (data > 9) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static Node addOne(Node head) {
        if (head != null) {
            int data = recursiveAdd(head);
            if (data == 1) {
                Node newHead = new Node(1);
                newHead.next = head;
                return newHead;
            }
            return head;
        } else {
            return head;
        }
    }
}

