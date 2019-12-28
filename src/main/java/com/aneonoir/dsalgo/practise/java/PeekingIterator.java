package com.aneonoir.dsalgo.practise.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/peeking-iterator/
 * <p>
 * tag: interview,
 * follow up : How would you extend your design to be generic and work with all types, not just integer?
 * <p>
 * TODO: can you do it without copying , see how others are doing it .
 */
public class PeekingIterator implements Iterator<Integer> {


    int currentLoc = -1;
    private List<Integer> lists = new LinkedList<>();

    public PeekingIterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            lists.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (hasNext()) {
            return lists.get(currentLoc + 1);
        } else {
            return -1;
        }
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (hasNext()) {
            currentLoc = currentLoc + 1;
            return lists.get(currentLoc);
        } else {
            return -1;
        }
    }

    @Override
    public boolean hasNext() {
        return currentLoc + 1 < lists.size();
    }
}