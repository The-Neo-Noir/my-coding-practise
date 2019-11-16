package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.HashSet;

/**
 * link:
 */
public class InerSectionOfTwoSortedList {

    Node head = new Node(null); // object of LinkedList having Intersection of two LinkedLists
    // Function  to find Intersection of two LinkedLists
    void getIntersection(Node head1, Node head2)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        while(head1!=null){

            set.add(head1.data);
            head1=head1.next;
        }

        Node tail=null;
        while(head2!=null){

            if(set.contains(head2.data) && !set2.contains(head2.data)){

                if(head==null){
                    set2.add(head2.data);
                    head= new Node(head2.data);
                    tail=head;
                }else{
                    set2.add(head2.data);
                    Node temp=  new Node(head2.data);
                    tail.next=temp;
                    tail=tail.next;
                }
            }
            head2=head2.next;
        }
    }
}
