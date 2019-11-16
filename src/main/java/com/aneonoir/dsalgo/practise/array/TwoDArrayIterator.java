package com.aneonoir.dsalgo.practise.array;

import java.util.Iterator;

/**
 * tags: iterator, design, interview,
 */
public class TwoDArrayIterator implements Iterable {

    private final int[][] data;

    private final int rowPointer = -1;
    private final int colPointer = -1;

    public TwoDArrayIterator(int[][] data) {
        this.data = data;
    }

    @Override
    public Iterator iterator() {
        return new ThisIterator();
    }

    private class ThisIterator implements Iterator {

        @Override
        public boolean hasNext() {
            if (data != null) {
                return rowPointer < data.length && data.length != 0;
            } else
                return false;

        }

        @Override
        public Object next() {
            return null;
        }
    }
}
