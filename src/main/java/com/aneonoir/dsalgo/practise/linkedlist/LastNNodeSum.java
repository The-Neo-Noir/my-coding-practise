package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

public class LastNNodeSum {


    //Return the sum of last k nodes
    public int sum(Node head, int k){
        Stack<Node> st = new Stack<>();
        while(head!=null){
            st.push(head);
            head=head.next;
        }
        int counter=0;
        int sum=0;
        while(counter<k){
            sum+=st.pop().value;
            counter++;
        }
        return sum;
    }
}
