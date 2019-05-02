package com.aneonoir.dsalgo.linkedlist;


public class Node {
    private int value;
    private Node nextNode;


    public Node(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void addNode(Node node) {
        this.nextNode = node;
    }

    public int getValue() {
        return this.value;
    }
}