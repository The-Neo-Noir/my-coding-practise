package com.aneonoir.dsalgo.practise.linkedlist;

/**
 *  Solved using recursion , with O(n) complexity and o(n) data
 *  Look at some other peoples solutions:
 *  https://leetcode.com/problems/palindrome-linked-list/discuss/407207/Java-reversing-during-first-half-of-loop-beats-100
 *
 *   see some iterative approach
 *   https://leetcode.com/problems/palindrome-linked-list/discuss/391873/Java-O(1)-space-using-reverse-with-comment
 *
 */
public class PalindormeListCheckUsingRecursion {

    private static boolean b = false;
    private static Node temp = null;

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(1);
        n.next.next = new Node(2);
        n.next.next.next = new Node(1);
        temp = n;
        System.out.println(checkrecursive(n));
    }

    private static boolean checkrecursive(Node head) {
        if (head.next == null) {
            boolean sdf = head.value == temp.value;
            temp = temp.next;
            return sdf;
        } else {
            boolean sdfs = checkrecursive(head.next);
            boolean res= temp.value == head.value;
            temp=temp.next;
            return res& sdfs;
        }
    }


}