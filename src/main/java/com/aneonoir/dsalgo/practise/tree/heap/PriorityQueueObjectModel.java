package com.aneonoir.dsalgo.practise.tree.heap;

import com.aneonoir.dsalgo.practise.tree.heap.exceptions.NoItemsInHeap;

public class PriorityQueueObjectModel implements IPriorityQueue {

    private Node holder = null;

    private int size = 0;

    private Node maxHeap = holder;
    private Node nextElement=null;

    public PriorityQueueObjectModel() {

    }

    @Override
    public int poll() {
        return 0;
    }

    @Override
    public void insert(int data) {
        if (holder == null) {
            holder = new Node();
            holder.val = data;
            maxHeap=holder;
            nextElement=maxHeap;
            size++;
        }else{
            Node node = new Node();
            node.val=data;



        }
    }

    @Override
    public int peek() {
        if (size == 0) {
            throw new NoItemsInHeap();
        } else {
            return maxHeap.val;
        }

    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        int val;
        Node left;
        Node right;
    }


}

