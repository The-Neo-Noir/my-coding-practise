package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
 *
 */
public class MoveTheTailToHead {
   private  static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
         Node node = new Node(1);
        node.next = new Node(2);
       // node.next.next = new Node(3);

        node = moveToFront(node);
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    private static Node moveToFront(Node node) {
        Node prev=node,tail=node;
        while(tail.next!=null){
            prev=tail;
            tail=tail.next;
        }
        tail.next=node;
        prev.next=null;

        return tail;
    }
}


