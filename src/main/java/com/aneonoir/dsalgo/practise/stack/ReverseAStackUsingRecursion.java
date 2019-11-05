package com.aneonoir.dsalgo.practise.stack;

import com.aneonoir.dsalgo.practise.stack.impls.StackImplLinkedList;
import com.aneonoir.dsalgo.practise.stack.impls.StackInterface;

/**
 * link: https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
 * <p>
 * Solved it using recursion, struggled putting the targetStack.push, ( not sure whether it should go before or after the self recursion )
 * <p>
 * The approach used in the link is different , can you check how ?
 */
public class ReverseAStackUsingRecursion {

    public static void main(String[] args) {
        StackInterface souceStack = new StackImplLinkedList();
        souceStack.push(1);
        souceStack.push(2);
        souceStack.push(3);
        souceStack.push(4);


        System.out.println(souceStack.peek());

        StackInterface targetStack = new StackImplLinkedList();

        recursiveReverse(souceStack, targetStack);

        System.out.print(targetStack.peek());
    }

    private static void recursiveReverse(StackInterface stackInterface, StackInterface targetStack) {

        if (stackInterface.isEmpty()) {
            return;
        } else {

            int pop = stackInterface.pop();
            targetStack.push(pop);
            recursiveReverse(stackInterface, targetStack);

        }
    }
}
