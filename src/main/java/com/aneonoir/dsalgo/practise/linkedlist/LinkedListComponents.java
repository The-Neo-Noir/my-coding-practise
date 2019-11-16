package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 */
public class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        HashMap<Integer, ListNode> source = new HashMap<>();
        while (head != null) {
            source.put(head.val, head.next);
            head = head.next;
        }
        HashMap<Integer, Boolean> list = new HashMap<>();

        int i = G.length;
        while (i-- > 0) {
            list.put(G[i], false);
        }
        int count = 0;

        Iterator<Integer> it = list.keySet().iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            ListNode key = source.get(next);
            if (list.get(next) == false && list.containsKey(key)) {
                list.put(next, true);
                list.put(key.val, true);
                count++;
            }
        }

        return count;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}