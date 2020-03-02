package com.aneonoir.dsalgo.practise.tree.heap;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>> {


    private List<T> data;
    private int lastIndex = -1;

    public PriorityQueue() {
        this.data = new ArrayList<>();
    }

    public void insert(T element) {
        data.add(element);
        lastIndex++;
        int parentIndex = (lastIndex - 1) / 2;
        T t = data.get(parentIndex);
        while (parentIndex >= 0 && t.compareTo(data.get(lastIndex)) > 0) { //
            swap(parentIndex, lastIndex);
            parentIndex = (parentIndex - 1) / 2;
        }
    }

    public void accessNth(int nth) {

    }

    private void swap(int parentIndex, int lastIndex) {
        T temp = data.get(parentIndex);
        data.set(parentIndex, data.get(lastIndex));
        data.set(lastIndex, temp);
    }

    public T access() {
        if (data.size() == 0) {
            return null;
        } else {
            return data.get(0);
        }
    }

    public T remove() {
        T result = null;
        if (lastIndex == 0) {
            result = data.get(0);
            lastIndex--;
            return result;
        } else if (lastIndex > 0) {
            int currentIndex=0;
            T t = data.get(currentIndex);
            data.set(0, t);
            lastIndex--;
            while ((t.compareTo(data.get(currentIndex * 2 + 1)) > 0) || t.compareTo(data.get(currentIndex * 2 + 2)) > 0 ){
                if (t.compareTo(data.get(currentIndex * 2 + 1)) > 0){
                    swap(0, currentIndex * 2 + 1);
                    currentIndex=currentIndex * 2 + 1;
                } else if (t.compareTo(data.get(currentIndex * 2 + 2)) > 0) {
                    swap(0, currentIndex * 2 + 2);
                    currentIndex=currentIndex * 2 + 2;
                }
                t = data.get(currentIndex);
            }

        }
        return result;
    }

    public T remove(T element) {
        return null;
    }

}
