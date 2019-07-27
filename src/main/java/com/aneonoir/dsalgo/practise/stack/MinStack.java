package com.aneonoir.dsalgo.practise.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * link: https://leetcode.com/problems/min-stack/
 * approach: have a container which contains the min value.
 * THIS one got me the best, while the approach is correct, I had my  container.add(new Container(x, x)); which is wrong, w
 * <p>
 * why ? because add allways adds at the end of the list,but not override , as I have not been removing elements, you could use
 * remove to not get into trouble, though.
 */
public class MinStack {

    private List<Container> container = new LinkedList<>();
    private int top;

    public MinStack() {
        top = -1;
        System.out.println("MinStack " + top);
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(2147483646);
        s.push(2147483646);
        s.push(2147483647);
        s.top();
        s.pop();
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.push(2147483647);
        s.top();
        s.getMin();
        s.push(-2147483648);
        s.top();
        s.getMin();
        s.pop();
        s.getMin();

    }

    public void push(int x) {
        if (top == -1) {
            container.add(++top, new Container(x, x));
        } else {
            int lastMin = getMin();
            int currentMin = x < lastMin ? x : lastMin;
            container.add(++top, new Container(x, currentMin));
        }
        System.out.println("push " + top);
    }

    public void pop() {
        Container tem = container.get(top);
        tem = null;
        top--;
        System.out.println("Pop " + top);
    }

    public int top() {
        System.out.println("Top " + top);
        return container.get(top).value;

    }

    public int getMin() {
        System.out.println("getMin " + top);
        return container.get(top).minValue;
    }

    /**
     * initialize your data structure here.
     */
    class Container {
        int value;
        int minValue;

        Container(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */