package com.aneonoir.dsalgo.practise.stack;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Link : Coding interview questions; page 244, Problem 11
 * <p>
 * Solution:
 * approach1:
 * 1. Brute force with extra space
 * 2. With recursion , recursion one don't use extra space. TODO
 */
public class ReverseElements {

    public static void main(String[] args) {
        //4,5,6 <-top , after 6,5,4 <-top
        Stack<Integer> integers = new Stack<>();
        integers.push(4);
        integers.push(5);
        integers.push(6);


        //Stack<Integer> stack = solutionUsingExtraStack(integers);
        solutionInRecursion(integers);

        // assertEquals(Integer.valueOf(4), stack.peek());
        //assertEquals(Integer.valueOf(4), stack.pop());
        // assertEquals(Integer.valueOf(5), stack.pop());
        // assertEquals(Integer.valueOf(6), stack.pop());


    }

    @Test
    public void testResursion() {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        solutionInRecursion(stack);

        assertEquals(Integer.valueOf(4), stack.peek());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(Integer.valueOf(5), stack.pop());
        assertEquals(Integer.valueOf(6), stack.pop());

    }

    private static void solutionInRecursion(Stack<Integer> integers) {

        if (!integers.empty()) {
            Integer pop = integers.pop();
            solutionInRecursion(integers);
            integers.push(pop);
        }else{

        }
    }

    private static Stack<Integer> solutionUsingExtraStack(Stack<Integer> integers) {
        Stack<Integer> stack = new Stack<>();
        while (!integers.empty()) {
            stack.push(integers.pop());
        }
        return stack;
    }
}
