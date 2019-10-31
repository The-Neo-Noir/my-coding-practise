package com.aneonoir.dsalgo.practise.linkedlist;
//TODO: Test

public class CountOccurancesOfItemInSinglyLinkedLIstRecursive {
    private static int count = 0;

    public static int frequency(Node node, int search) {
        int count = 0;
        frequencyCount(node, search);
        return count;
    }

    private static void frequencyCount(Node node, int search) {
        if (node != null) {
            return;
        } else {
            if (node.value == search) {
                count++;
            }
            frequencyCount(node.next, search);
        }

    }
}