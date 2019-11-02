package com.aneonoir.dsalgo.practise.linkedlist;

/**
 * link: slef
 * Struggled , in swapping head and the tail nodes.
 *
 */
public class SwapHeadAndTailNodes {

    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node= new Node(1);
        node.next= new Node(2);
        node.next.next = new Node(3);

          node= moveToFront(node);

        while(node!=null){
            System.out.println(node.data+ " ");
            node=node.next;
        }
    }

    private static Node moveToFront(Node head) {
        if(head==null){
            return head;
        }
        Node tail=head, temp=head;
        Node prev=tail;
        while (tail.next != null) {
            prev=tail;
            tail = tail.next;
        }
        if(prev==temp){
            head.next=null;
            tail.next=head;
        }else{
            tail.next=temp.next;
            temp.next=null;
            prev.next=temp;
        }

       return tail;
    }
}
