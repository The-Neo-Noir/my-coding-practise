package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/absolute-list-sorting/1
 * <p>
 * approach: if you encounter a number negative then move it to the head.
 * <p>
 * tags: list, insertion list, interview, struggle, absolute disaster,
 * <p>
 * struggle, what if your input is -1,-2,-3. If you do'nt have a check like in hea head!=curr then gone case.....:((
 */
public class AbsoluteListSorting {

    public static void main(String[] args) {
        Node n = new Node(-1);
        n.next = new Node(-3);
        n.next.next = new Node(-4);
        Node node = sortedList(n);
    }

    static Node sortedList(Node head) {
        Node prev = head, curr = head;
        while (curr != null) {
            if (curr.value < 0 && head != curr) {
                prev.next = curr.next;
                curr.next = head;
                head = curr;
                curr = prev;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

}
