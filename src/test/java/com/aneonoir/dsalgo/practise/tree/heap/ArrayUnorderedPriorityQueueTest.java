package com.aneonoir.dsalgo.practise.tree.heap;

import com.aneonoir.dsalgo.practise.tree.heap.exceptions.HeapSpaceExceeded;
import com.aneonoir.dsalgo.practise.tree.heap.exceptions.NoItemsInHeap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayUnorderedPriorityQueueTest {

    @Test(expected = NoItemsInHeap.class)
    public void whenHeapIsNotAllocated_peek_shouldReturnNegative() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        int peek = arrayUnorderedPriorityQueue.peek();
        assertEquals(-1, peek);
    }

    @Test
    public void whenHeapIsAllocated_peek_shouldReturnHighestValue() {

        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        arrayUnorderedPriorityQueue.insert(4);
        int peek = arrayUnorderedPriorityQueue.peek();
        assertEquals(4, peek);

    }

    @Test
    public void whenHeapIsAllocatedWithThreeValues_peek_shouldReturnHighestValue() {

        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(3);
        arrayUnorderedPriorityQueue.insert(4);
        arrayUnorderedPriorityQueue.insert(-4);
        arrayUnorderedPriorityQueue.insert(9);
        int peek = arrayUnorderedPriorityQueue.peek();
        assertEquals(9, peek);

    }

    @Test
    public void whenHeapIsNotInserted_size_shouldreturn0() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        int size = arrayUnorderedPriorityQueue.size();
        assertEquals(0, size);
    }

    @Test
    public void whenHeapIsInsertedWith1_size_shouldreturn1() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        arrayUnorderedPriorityQueue.insert(4);

        int size = arrayUnorderedPriorityQueue.size();
        assertEquals(1, size);
    }

    @Test
    public void whenHeapIsInsertedWith2_size_shouldreturn2() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(2);
        arrayUnorderedPriorityQueue.insert(4);
        arrayUnorderedPriorityQueue.insert(3);

        int size = arrayUnorderedPriorityQueue.size();
        assertEquals(2, size);
    }

    @Test(expected = NoItemsInHeap.class)
    public void whenOneElement1_size_shouldThrowException() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        arrayUnorderedPriorityQueue.insert(3);
        int poll = arrayUnorderedPriorityQueue.poll();
        int poll2 = arrayUnorderedPriorityQueue.poll();
        assertEquals(0, arrayUnorderedPriorityQueue.size());
    }

    @Test
    public void whenOneElement_size_shouldThrowException() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        arrayUnorderedPriorityQueue.insert(3);
        int poll = arrayUnorderedPriorityQueue.poll();
        assertEquals(0, arrayUnorderedPriorityQueue.size());
    }

    @Test
    public void whenHeapIsInsertedWithDuplicates_size_shouldreturn2() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(2);
        arrayUnorderedPriorityQueue.insert(4);
        arrayUnorderedPriorityQueue.insert(4);

        int size = arrayUnorderedPriorityQueue.size();
        assertEquals(2, size);
    }

    @Test(expected = HeapSpaceExceeded.class)
    public void whenHeapIsInsertedWithDuplicatesButExceededInsertion_size_shouldreturn2() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(2);
        arrayUnorderedPriorityQueue.insert(4);
        arrayUnorderedPriorityQueue.insert(4);
        arrayUnorderedPriorityQueue.insert(4);

        int size = arrayUnorderedPriorityQueue.size();
        assertEquals(2, size);
    }

    @Test(expected = NoItemsInHeap.class)
    public void whenNoElement_poll_shouldThrowException() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        int poll = arrayUnorderedPriorityQueue.poll();
    }

    @Test
    public void whenOneElement_poll_shouldThrowException() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(1);
        arrayUnorderedPriorityQueue.insert(3);

        int poll = arrayUnorderedPriorityQueue.poll();
        assertEquals(3, poll);
    }

    @Test
    public void whenMultipleElements_poll_shouldCorrectOrdering() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(4);
        arrayUnorderedPriorityQueue.insert(3);
        arrayUnorderedPriorityQueue.insert(6);
        arrayUnorderedPriorityQueue.insert(5);
        arrayUnorderedPriorityQueue.insert(1);

        int poll = arrayUnorderedPriorityQueue.poll();
        assertEquals(6, poll);

        assertEquals(5, arrayUnorderedPriorityQueue.poll());
        assertEquals(3, arrayUnorderedPriorityQueue.poll());
        assertEquals(1, arrayUnorderedPriorityQueue.poll());
    }
    @Test
    public void whenMultipleElementsWithDuplicates_poll_shouldCorrectOrdering() {
        ArrayUnorderedPriorityQueue arrayUnorderedPriorityQueue = new ArrayUnorderedPriorityQueue(6);
        arrayUnorderedPriorityQueue.insert(3);
        arrayUnorderedPriorityQueue.insert(6);
        arrayUnorderedPriorityQueue.insert(6);
        arrayUnorderedPriorityQueue.insert(5);
        arrayUnorderedPriorityQueue.insert(1);

        int poll = arrayUnorderedPriorityQueue.poll();
        assertEquals(6, poll);

        assertEquals(6, arrayUnorderedPriorityQueue.poll());
        assertEquals(5, arrayUnorderedPriorityQueue.poll());
        assertEquals(3, arrayUnorderedPriorityQueue.poll());
        assertEquals(1, arrayUnorderedPriorityQueue.poll());
    }




}