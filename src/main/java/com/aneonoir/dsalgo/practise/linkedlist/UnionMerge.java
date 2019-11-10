package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.HashSet;

/**
 * link: https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1
 *
 * approach: pretty bruteforce.
 * tags: list, sorting, interview
 * struggle: struggled, as I am getting confused over java being pass by value, will not update the pointer, passed, if pointer being assigned a new node.
 * In cases like that we should return the value and assign it in the caller.
 *
 */
public class UnionMerge {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node head1 = new Node(2);
        head1.next = new Node(3);

        Node head2 = new Node(4);
        head2.next = new Node(5);

        UnionMerge unionMerge = new UnionMerge();
        Node union = unionMerge.findUnion(head1, head2);


    }
    Node findUnion(Node head1,Node head2)
    {
        Node head=null;
        if(head1!=null){
            head= new Node(head1.data);
        }else{
            if(head2!=null){
                head= new Node(head2.data);
            }else{
                return null;
            }
        }


        Node tail=head;
        HashSet<Integer> hashedData= new HashSet<>();
        hashedData.add(head.data);
        head1=head1.next;
        while(head1!=null){
            if(hashedData.add(head1.data)){
                if(head1.data<head.data){
                    head=insertAtHead(head1,head,tail);
                }else{
                    if(head1.data>tail.data){
                        tail=  insertAtTail(head1,tail);
                    }else{
                        insertInTheMiddle(head1, head);
                    }
                }
            }
            head1=head1.next;
        }

        while(head2!=null){
            if(hashedData.add(head2.data)){
                if(head2.data<head.data){
                    head=insertAtHead(head2,head,tail);
                }else{
                    if(head2.data>tail.data){
                        tail=  insertAtTail(head2,tail);
                    }else{
                        insertInTheMiddle(head2, head);
                    }
                }
            }
            head2=head2.next;
        }
        return head;
    }

    private Node  insertAtHead(Node toBeNode,Node head,Node tail){
        Node newN=new Node(toBeNode.data);
        tail=head;
        newN.next=head;
        head=newN;
        return head;
    }
    private Node  insertAtTail(Node toBeNode,Node tail){
        Node newN=new Node(toBeNode.data);
        tail.next=newN;
        tail=newN;
        return tail;
    }
    private void insertInTheMiddle(Node toBeNode,Node head){
        Node temp= head;
        Node prev= head;
        while(temp!=null && toBeNode.data>temp.data){
            prev=temp;
            temp=temp.next;
        }
        Node newN=new Node(toBeNode.data);
        prev.next=newN;
        newN.next=temp;
    }

}
