package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/delete-alternate-nodes/1
 *
 *
 */
public class DeleteAlternateNodes {
    /**
     * link: https://practice.geeksforgeeks.org/problems/delete-alternate-nodes/1
     *
     *
     * @param head
     */

    public void deleteAlternate (Node head){
        Node temp=head;
        while(temp!=null){
            if ( temp.next!=null){
                temp.next= temp.next.next;
            }else{
                temp.next= null;
            }
            System.out.print(temp.value+" ");
            temp= temp.next;
        }
    }
}
