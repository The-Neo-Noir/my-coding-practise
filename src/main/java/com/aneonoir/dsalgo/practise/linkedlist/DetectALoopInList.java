package com.aneonoir.dsalgo.practise.linkedlist;

public class DetectALoopInList {
    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next=head.next;
        int i = detectLoop(head);
        System.out.println(i == 0 ? " No Loop" : "Loop found ");
    }
    static int detectLoop(Node head) {
        Node slow=head, fast=head;
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return 1;
            }
        }
        return 0;
    }
}
