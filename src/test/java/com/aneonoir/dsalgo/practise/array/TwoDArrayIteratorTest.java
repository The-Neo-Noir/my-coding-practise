package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoDArrayIteratorTest {

    @Test
    public void iterator() {
        TwoDArrayIterator twoDArrayIterator = new TwoDArrayIterator(new int[][]{});
        Iterator iterator = twoDArrayIterator.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void iteratorhasNextOne() {
        TwoDArrayIterator twoDArrayIterator = new TwoDArrayIterator(new int[][]{{1}});

        Iterator iterator = twoDArrayIterator.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    public void iteratorhasNextNull() {
        TwoDArrayIterator twoDArrayIterator = new TwoDArrayIterator(null);

        Iterator iterator = twoDArrayIterator.iterator();
        assertFalse(iterator.hasNext());
    }


}