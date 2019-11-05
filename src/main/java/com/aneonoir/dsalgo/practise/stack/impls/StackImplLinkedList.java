package com.aneonoir.dsalgo.practise.stack.impls;

/**
 * self:
 */
public class StackImplLinkedList implements StackInterface {

    private StackNode store;
    private int size;

    @Override
    public void push(int i) {
        if (store == null) {
            store = new StackNode(i);
        } else {
            StackNode stackNode = new StackNode(i);
            stackNode.next = store;
            store = stackNode;
        }
        size++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        } else {
            int result = store.data;
            StackNode temp = store;
            store = store.next;
            temp = null;
            size--;
            return result;
        }
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        } else {
            return store.data;
        }
    }

    @Override
    public boolean isEmpty() {
        return store == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void reverse() {
        if (!isEmpty()) {

            StackNode prev = this.store,
                    curr = this.store,
                    succ;
            curr = curr.next;
            prev.next = null;
            while (curr != null) {
                succ = curr.next;
                curr.next = prev;
                prev = curr;
                curr = succ;
            }
            this.store = prev;
        }

    }

    private class StackNode {
        int data;
        StackNode next;

        public StackNode(int i) {
            this.data = i;
        }
    }
}
