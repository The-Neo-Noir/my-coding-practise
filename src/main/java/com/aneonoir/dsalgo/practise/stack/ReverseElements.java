package com.aneonoir.dsalgo.practise.stack;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Link : Coding interview questions; page 244, Problem 11
 * <p>
 * Solution:
 * approach1: Brute force with extra space
 */
public class ReverseElements {

    public static void main(String[] args) {
        //4,5,6 <-top , after 6,5,4 <-top
        Stack<Integer> integers = new Stack<>();
        integers.push(4);
        integers.push(5);
        integers.push(6);


        Stack<Integer> stack = solutionUsingExtraStack(integers);

        assertEquals(Integer.valueOf(4), stack.peek());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(Integer.valueOf(5), stack.pop());
        assertEquals(Integer.valueOf(6), stack.pop());


    }

    private static Stack<Integer> solutionUsingExtraStack(Stack<Integer> integers) {
        Stack<Integer> stack = new Stack<>();
        while (!integers.empty()) {
            stack.push(integers.pop());
        }
        return stack;
    }
}
