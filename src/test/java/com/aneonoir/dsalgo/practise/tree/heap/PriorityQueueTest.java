package com.aneonoir.dsalgo.practise.tree.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void insertWhenElementisEmpty_ShouldReturnSame() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.insert(20);

        Integer access = pq.access();
        assertEquals(Integer.valueOf(20), access);

    }

    @Test
    public void whenAnElementIsAlreadyThereWithLowPriority_shouldReturnNewlyInsertedElement() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.insert(20);
        pq.insert(1);
        Integer access = pq.access();
        assertEquals(Integer.valueOf(1), access);
    }
    @Test
    public void whenAnElementIsAlreadyThereWithLowPriority_shouldReturnNewlyInsertedElement1() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.insert(20);
        pq.insert(10);
        Integer access = pq.access();
        assertEquals(Integer.valueOf(10), access);

        pq.insert(1);
        Integer access2 = pq.access();
        assertEquals(Integer.valueOf(1), access2);
    }

}