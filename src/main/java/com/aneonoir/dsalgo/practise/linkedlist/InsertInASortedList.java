package com.aneonoir.dsalgo.practise.linkedlist;
/** link: https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
 *
 * tag: interview, list,
 *
 */
public class InsertInASortedList {
    Node sortedInsert(Node head1,int key)
    {
        if(head1!=null){
            Node temp= head1;
            Node head=head1,tail=head1;
            while(temp!=null){
                tail=temp;
                temp=temp.next;
            }
            if(key<head.value){
                Node temp1=new Node(key);
                temp1.next=head;
                head1=temp1;
            }else{
                if(key>tail.value){
                    Node temp2=new Node(key);
                    tail.next=temp2;
                    tail=temp2;
                }else{
                    temp=head1;
                    Node prev=head1;
                    while(temp!=null && key>temp.value){
                        prev=temp;
                        temp=temp.next;
                    }
                    prev.next= new Node(key);
                    prev.next.next=temp;
                }
            }

            return head1;
        }else{
            Node temp= new Node(key);

            return temp;
        }
    }
}
