package com.aneonoir.dsalgo.practise.linkedlist;

import java.util.Stack;

/**
 *  link: https://practice.geeksforgeeks.org/problems/decimal-equivalent-of-binary-linked-list/1
 *
 *  Approach : stuggled in creating the counter variable .
 *  TODO: do it using recursion .
 */
public class DecimalEquivalentBinaryLinkedLIst {
    long DecimalValue(Node head)
    {
        Node temp = head;
        int count=0;
        Stack<Integer> st  = new Stack<>();
        while(temp!=null){
            st.push(temp.value);
            temp=temp.next;
            count++;
        }
        int startcounter=0;
        long sum=0;
        while(!st.isEmpty()){
            sum+=((Math.pow(2, startcounter++) %1000000007 * st.pop())%1000000007  );
        }
        return sum%1000000007;
    }
}
