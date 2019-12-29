package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/identical-linked-lists/1
 * <p>
 * good warm up
 * tag: linkedlist, dual traversal , list
 */
public class IdenticalList {


    public boolean isIdentical(Node head1, Node head2) {
        //write your code here and return true if they are identical, otherwise false
        if (head1 == null && head2 == null) return true;
        boolean res = true;
        while (head1 != null && head2 != null) {
            if (head1.value != head2.value) {
                res = false;
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if (res && (head1 != null || head2 != null)) res = false;
        return res;
        // case 1: both null ()
        // case 2: same width,same val [1],[1]
        // case 3: same widht , diff val [1] [2]
        // case 4: differnt widh, same val [1] ,[1,2]; [1,2],[1] , [1],[2,1]

    }
}
