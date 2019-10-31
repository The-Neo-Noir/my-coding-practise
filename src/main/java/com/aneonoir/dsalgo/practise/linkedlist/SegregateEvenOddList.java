package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Scanner;

/**
 * Gocha: what if there is no even only odd ??? failed to address it thus it gave me nullpointerexception
 */
public class SegregateEvenOddList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int number = sc.nextInt();
            Node head = null;
            Node moving = null;
            for (int j = 0; j < number; j++) {
                Node n = new Node(sc.nextInt());
                if (head == null) {
                    moving = head = n;
                } else {
                    moving.next = n;
                    moving = moving.next;
                }
            }
            segregate(head);
        }
    }

    public static void segregate(Node head) {
        // Prepare even and odd list
        Node evenHead = null;
        Node movingEvenHead = null;
        Node evenTail = null;

        Node oddHead = null;
        Node movingOddHead = null;
        while (head != null) {
            int data = head.value;
            if (head.value % 2 == 0) {
                if (evenHead == null) {
                    movingEvenHead = evenHead = new Node(data);
                } else {
                    movingEvenHead.next = new Node(data);
                    movingEvenHead = movingEvenHead.next;
                }
            } else {
                if (oddHead == null) {
                    movingOddHead = oddHead = new Node(data);
                } else {
                    movingOddHead.next = new Node(data);
                    movingOddHead = movingOddHead.next;
                }
            }
            head = head.next;
        }
        if (movingEvenHead == null) {
            evenHead = oddHead;
        } else {
            movingEvenHead.next = oddHead;
        }


        while (evenHead != null) {
            System.out.print(evenHead.value + " ");
            evenHead = evenHead.next;
        }
        System.out.println();

    }
}
