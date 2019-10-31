package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * todo:
 */
public class PalindormeListCheckUsingRecursion {

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        checkrecursive(n, n);
    }

    private static Node checkrecursive(Node head, Node temp) {

        if (head == null) {
            return null;
        } else {
            Node temp2 = head;
            Node retu = checkrecursive(head.next, temp);

            System.out.println("enty" + temp2.value + "  " + retu.value);

        }

    }


}