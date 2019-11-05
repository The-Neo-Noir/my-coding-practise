package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
 * <p>
 * tags: interview
 * stuggly: Things will go wrong if the current=head.next and prev.next=null are kept not inline, so remember that
 */
public class ReverseLinkedListThreePointerTechnique {

    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        Node d = reverseList(node);
        d.print();

    }

    private static Node reverseList(Node head) {
        Node prev = head, current = head.next, succ = head;
        prev.next = null;
        while (current != null) {
            succ = current.next;
            current.next = prev;
            prev = current;
            current = succ;
        }
        return head = prev;
    }
}
