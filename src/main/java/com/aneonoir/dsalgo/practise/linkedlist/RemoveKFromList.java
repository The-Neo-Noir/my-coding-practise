package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://app.codesignal.com/interview-practice/task/gX7NXPBrYThXZuanm
 * <p>
 * solution: TODO: can you do it recursively
 * <p>
 * tags: list,linkelist,remove 'k' element from list, interview question
 */
public class RemoveKFromList {

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode temp = l, head = l, prev = l;

        while (temp != null) {
            if (temp.value.equals(k)) {
                if (head == temp) {
                    head = temp.next;
                    prev = temp.next;
                } else {
                    prev.next = temp.next;
                }
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;

    }

    private class ListNode<T> {
        T value;
        ListNode<T> next;

        ListNode(T x) {
            value = x;
        }
    }

}
