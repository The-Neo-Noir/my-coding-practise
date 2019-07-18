package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://app.codesignal.com/interview-practice/task/gX7NXPBrYThXZuanm
 * <p>
 * solution: TODO:  a good bit of struggle I faced. must redo
 */
public class RemoveKFromList {

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

        ListNode<Integer> pNode = l, cNode = l;
        int counter = 0;
        boolean flag = false;
        while (cNode != null) {

            if (cNode.value == k) {
                pNode.next = cNode.next;
                if (counter == 0) {
                    flag = true;
                    l = cNode.next;
                }
            }
            pNode = cNode;
            cNode = cNode.next;
            counter++;
            if (flag) {
                counter = 0;
                flag = false;
            }

        }
        return l;
    }

}
