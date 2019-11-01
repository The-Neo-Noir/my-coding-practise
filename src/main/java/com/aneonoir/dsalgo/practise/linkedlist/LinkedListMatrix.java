package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://practice.geeksforgeeks.org/problems/linked-list-matrix/1
 * approach: pretty bruteforce ;
 *
 *
 */
public class LinkedListMatrix {
    static class Node
    {
        int data;
        Node right,down;

        Node(int data){
            this.data = data;
            right = null;
            down = null;
        }
    }
    static Node construct(int arr[][],int n)
    {

        Node head=null;
        Node lastRowPointer=null;
        for(int i=0;i<n;i++){
            Node rowHead=null;
            Node walker=rowHead;
            for(int j=0;j<n;j++){
                Node temp= new Node(arr[i][j]);
                if(rowHead==null){
                    rowHead=temp;
                    walker=rowHead;
                    if(i==0){
                        head=rowHead;
                    }
                    if(lastRowPointer!=null){
                        lastRowPointer.down=rowHead;
                        lastRowPointer=lastRowPointer.right;
                    }
                }else{
                    walker.right=temp;
                    if(lastRowPointer!=null){
                        lastRowPointer.down=temp;
                        lastRowPointer=lastRowPointer.right;
                    }
                    walker=walker.right;

                }
            }
            lastRowPointer=rowHead;
            walker=null;
        }
        return head;
    }
}
