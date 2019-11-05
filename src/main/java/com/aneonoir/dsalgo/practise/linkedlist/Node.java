package com.aneonoir.dsalgo.practise.linkedlist;


public class Node {
    public int value;
    public Node next;


    public Node(int value) {
        this.value = value;
    }

    public void addNode(Node node3) {
        this.next = node3;
    }

    public void print() {
        Node temp = this;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }
}