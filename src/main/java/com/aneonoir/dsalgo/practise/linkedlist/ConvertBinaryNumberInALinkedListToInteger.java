package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.LinkedList;

/**
 * 01/01/20
 * link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * <p>
 * tag:
 * <p>
 * TODO: Runtime: 1 ms, faster than 19.25% of Java online submissions for Convert Binary Number in a Linked List to Integer.
 * <p>
 * why slow , can you do it faster ?
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/452970/JAVA-Easy-to-Understand-and-Readable-Solution this could be faster.
 * <p>
 * The idea is to start from the most signifincant bit
 * 01/01/20: I got the new way of learning: You can start from most significant bit.
 * see getDecimalValue2, can you do the same for decimal numbers.
 */


public class ConvertBinaryNumberInALinkedListToInteger {

    public int getDecival() {
        int o[] = new int[]{2, 3, 4};
        int result = 0;
        for (Integer in : o) {
            result *= 10;
            result += in;
        }

    return result;
    }



    // See this is how its done.
//        0;
//        2;
//        2*10=20;
//        20+3;
//        23*10=230;
//        230+4;230

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 01/01/20 12:58 PM: update
     *
     * @param head
     * @return
     */
    public int getDecimalValue2(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        while (head != null) {
            list.addFirst(head.val);
            head = head.next;
        }
        int result = 0;
        int counter = 0;
        for (Integer s : list) {
            result = result | (s * (1 << counter));
            counter++;
        }
        return result;
    }


    public int getDecimalValue(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        while (head != null) {
            list.addFirst(head.val);
            head = head.next;
        }
        int result = 0;
        int counter = 0;
        for (Integer s : list) {
            result = result | (s * (1 << counter));
            counter++;
        }
        return result;
    }
}

