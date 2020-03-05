package com.aneonoir.dsalgo.practise.tree.heap;

import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;

/**
 * This class is to explore the behavior of priority Queque in java.
 * <p>
 * The name of the test case
 */
public class ExploringPriorityQueue {

    @Test
    public void javaHeapIterator_minHeap_NotPredictable() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(3);
        in.add(4);
        in.add(2);
        in.add(8);

        for (Integer i : in) {
            System.out.println(i);
        }
    }

    @Test
    public void minNumber_inMinHeap() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(2);
        in.add(4);
        in.add(3);
        in.add(8);
        Integer peek = in.peek();
        assertEquals(Integer.valueOf(2), peek);
    }

    @Test
    public void minNumber_inMinHeap2() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);
        Integer peek = in.poll();

        assertEquals(Integer.valueOf(2), peek);
    }

    @Test
    public void minNumber_2ndMin() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);

        in.poll();
        Integer peek = in.poll();
        assertEquals(Integer.valueOf(3), peek);
    }
    @Test
    public void minNumber_nthdMin() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);
        int n=2;
        while(n>1){
            in.poll();
            n--;
        }

        Integer peek = in.poll();
        assertEquals(Integer.valueOf(3), peek);
    }
    @Test
    public void minNumber_nthdMin_whenNthIsEqualToQueueSize() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);
        int n=4;
        while(n>1){
            in.poll();
            n--;
        }

        Integer peek = in.poll();
        assertEquals(Integer.valueOf(8), peek);
    }
    // This brings to a point when we try to differenciate remove() and poll() method.
    @Test(expected = NoSuchElementException.class)
    public void minNumber_nthdMin_remove_whenNthIsGreterThanQueueSize() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);
        int n=6;
        while(n>1){
            in.remove();
            n--;
        }

        Integer peek = in.remove();
        assertEquals(Integer.valueOf(8), peek);
    }
    @Test
    public void minNumber_nthdMin_poll_whenNthIsGreterThanQueueSize() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);
        int n=6;
        while(n>1){
            in.poll();
            n--;
        }

        Integer peek = in.poll();
        assertEquals(null, peek);
    }







    //
    @Test
    public void minNumber_nthdMinWithDuplicates() {
        java.util.PriorityQueue<Integer> in = new java.util.PriorityQueue<>();
        in.add(4);
        in.add(3);
        in.add(8);
        in.add(2);
        in.add(2);
        int n=2;
        while(n>1){
            in.poll();
            n--;
        }

        Integer peek = in.poll();
        assertEquals(Integer.valueOf(3), peek);
    }
}
