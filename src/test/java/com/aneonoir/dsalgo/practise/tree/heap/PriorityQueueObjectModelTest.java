package com.aneonoir.dsalgo.practise.tree.heap;

import com.aneonoir.dsalgo.practise.tree.heap.exceptions.NoItemsInHeap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriorityQueueObjectModelTest {

    @Test
    public void whenThereIsOneElement_peek_ShouldReturnThat() {
        PriorityQueueObjectModel priorityQueueObjectModel = new PriorityQueueObjectModel();
        priorityQueueObjectModel.insert(4);

        int peek = priorityQueueObjectModel.peek();
        assertEquals(4, peek);

    }

    @Test
    public void whenThereIsTwoElement_peek_ShouldReturnThat() {
        PriorityQueueObjectModel priorityQueueObjectModel = new PriorityQueueObjectModel();
        priorityQueueObjectModel.insert(2);
        int peek1 = priorityQueueObjectModel.peek();
        assertEquals(2, peek1);
        priorityQueueObjectModel.insert(3);

        int peek = priorityQueueObjectModel.peek();
        assertEquals(3, peek);
        assertEquals(2, priorityQueueObjectModel.size() );

    }



    @Test(expected = NoItemsInHeap.class)
    public void whenThereIsNoElement_peek_ShouldThrowException() {
        PriorityQueueObjectModel priorityQueueObjectModel = new PriorityQueueObjectModel();
        priorityQueueObjectModel.peek();

    }

    @Test
    public void whenThereIsNoElement_size_ShouldReturn0() {
        PriorityQueueObjectModel priorityQueueObjectModel = new PriorityQueueObjectModel();
        int size = priorityQueueObjectModel.size();
        assertEquals(0, size);
    }
}