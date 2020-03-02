package com.aneonoir.dsalgo.practise.tree.heap;

public interface IPriorityQueue {
    int poll();

    void insert(int data);

    int peek();

    int size();


}
