package com.aneonoir.dsalgo.practise.stack.impls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackImplLinkedListTest {


    private StackInterface stackInterface;

    @Before
    public void setup() {
        stackInterface = new StackImplLinkedList();
    }

    @Test
    public void push() {


        stackInterface.push(1);
        assertFalse(stackInterface.isEmpty());
        assertTrue(stackInterface.size() == 1);


        stackInterface.push(2);
        stackInterface.push(3);

        assertEquals(3, stackInterface.size());
    }

    @Test
    public void initialValue() {
        assertTrue(stackInterface.isEmpty());
        assertTrue(stackInterface.size() == 0);
    }

    @Test
    public void pop() {
        stackInterface.push(1);
        assertFalse(stackInterface.isEmpty());
        assertTrue(stackInterface.size() == 1);


        stackInterface.push(2);
        stackInterface.push(3);

        assertEquals(3, stackInterface.size());
        int pop = stackInterface.pop();
        assertEquals(pop, 3);
        assertEquals(2, stackInterface.size());
    }

    @Test(expected = RuntimeException.class)

    public void popWhenEmpty() {

        int pop = stackInterface.pop();
        assertEquals(0, stackInterface.size());
    }

    @Test
    public void peek() {
        stackInterface.push(1);
        assertFalse(stackInterface.isEmpty());
        assertTrue(stackInterface.size() == 1);


        stackInterface.push(2);
        stackInterface.push(3);

        assertEquals(3, stackInterface.size());
        int pop = stackInterface.peek();
        assertEquals(pop, 3);
        assertEquals(3, stackInterface.size());

    }

    @Test(expected = RuntimeException.class)
    public void peekWhenEmpty() {
        stackInterface.peek();

        assertEquals(0, stackInterface.size());

    }

    @Test(expected = RuntimeException.class)
    public void peekWhenEmptyAfterOperation() {
        stackInterface.push(1);
        stackInterface.push(2);

        assertEquals(2, stackInterface.peek());

        stackInterface.pop();
        stackInterface.pop();
        stackInterface.peek();

        assertEquals(0, stackInterface.size());

    }

    @Test
    public void isEmpty() {
        stackInterface.push(1);
        stackInterface.pop();
        assertEquals(0, stackInterface.size());
        assertTrue(stackInterface.isEmpty());
    }

    @Test
    public void size() {

        stackInterface.push(1);
        stackInterface.pop();
        assertEquals(0, stackInterface.size());
        assertTrue(stackInterface.isEmpty());
    }
}