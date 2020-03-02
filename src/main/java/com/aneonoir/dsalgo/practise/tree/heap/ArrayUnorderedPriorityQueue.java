package com.aneonoir.dsalgo.practise.tree.heap;

import com.aneonoir.dsalgo.practise.tree.heap.exceptions.HeapSpaceExceeded;
import com.aneonoir.dsalgo.practise.tree.heap.exceptions.NoItemsInHeap;

/**
 * This is a contant space heap
 */
public class ArrayUnorderedPriorityQueue implements IPriorityQueue {


    private int[] data;
    int index = -1;

    public ArrayUnorderedPriorityQueue(int heapSize) {
        if (heapSize <= 0) throw new UnsupportedOperationException(" Don't allow zero or negative value");
        data = new int[heapSize];
    }


    @Override
    public int poll() {
        int i1 = -1;
        if ((i1 = peekIndex()) == -1)
            throw new NoItemsInHeap();
        else {
            int result = data[i1];
            for (int i = i1; i < index; i++) {
                data[i] = data[i + 1];
            }
            index--;
            return result;
        }
    }

    @Override
    public void insert(int val) {
        if (index < data.length - 1) {
            data[++index] = val;
        } else {
            throw new HeapSpaceExceeded();
        }
    }

    private int peekIndex() {
        if(index<0){
            return -1;
        }
        int i = 0;
        int max = data[i];
        int in= -1;
        for (int j = 0; j <= index; j++) {
            if (max <= data[j]) {
                max = data[j];
                in = j;
            }
        }
        return in;

    }

    @Override
    public int peek() {
        int in = -1;
        if (index == -1) {
            throw new NoItemsInHeap();
        } else {
            in = peekIndex();
        }
        return data[index];
    }

    @Override
    public int size() {
        return index + 1;
    }

}
