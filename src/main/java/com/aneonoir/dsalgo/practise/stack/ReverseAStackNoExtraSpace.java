package com.aneonoir.dsalgo.practise.stack;

import com.aneonoir.dsalgo.practise.stack.impls.StackImplLinkedList;

/**
 * link : https://www.geeksforgeeks.org/reverse-stack-without-using-extra-space/
 * similar question to {@link ReverseAStackUsingRecursion} but without using extra space.
 * It uses linkedlist and reverses it
 */
public class ReverseAStackNoExtraSpace {

    public static void main(String[] args) {
        StackImplLinkedList souceStack = new StackImplLinkedList();
        souceStack.push(1);
        souceStack.push(2);
        souceStack.push(3);
        souceStack.push(4);


        System.out.println(souceStack.peek());

        souceStack.reverse();

        System.out.print(souceStack.peek());
    }
}
