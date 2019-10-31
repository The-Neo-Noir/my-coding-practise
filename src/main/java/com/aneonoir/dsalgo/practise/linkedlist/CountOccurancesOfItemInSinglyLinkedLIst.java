package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://www.geeksforgeeks.org/write-a-function-that-counts-the-number-of-times-a-given-int-occurs-in-a-linked-list/
 * <p>
 * <p>
 * tag: linkedlist,searching,
 */
public class CountOccurancesOfItemInSinglyLinkedLIst {
    public static int frequency(Node node, int search) {
        int count = 0;
        Node temp = node;
        while (node != null) {
            if (node.value == search)
                count++;
            node = node.next;
        }
        return count;
    }
}