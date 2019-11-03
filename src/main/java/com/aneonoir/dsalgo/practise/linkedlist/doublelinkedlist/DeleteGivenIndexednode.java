package com.aneonoir.dsalgo.practise.linkedlist.doublelinkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1
 */
public class DeleteGivenIndexednode {

    Node deleteNode(Node head,int x)
    {
        Node tempHead=head;
        if( x==1){
            Node temp=head;
            head=head.next;
            temp=null;
            tempHead=head;
        }else{
            int c=1;
            while(c<x){
                head=head.next;
                c++;
            }
            Node temp2=head;
            head.prev.next=head.next;
            if(head.next!=null){
                head.next.prev=head.prev;
            }
            temp2=null;
        }
        return tempHead;
    }
}
