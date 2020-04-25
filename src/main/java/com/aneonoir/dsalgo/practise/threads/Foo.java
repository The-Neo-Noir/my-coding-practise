package com.aneonoir.dsalgo.practise.threads;

/**
 * link: https://leetcode.com/problems/print-in-order/submissions/
 *
 * TODO: Runtime: 10 ms, faster than 49.66% of Java online submissions for Print in Order.
 * Memory Usage:
 *
 * tag : interview question, easy, must-do-threads,threads,
 */
public class Foo {

    public Foo() {

    }

    volatile Boolean firstPrinted = false;

    volatile Boolean secondPrinted = false;

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            printFirst.run();
            notifyAll();
            firstPrinted = true;
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (!firstPrinted) {
                wait();
            }
            printSecond.run();
            secondPrinted = true;
            notifyAll();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.

    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            while (!secondPrinted) {
                wait();
            }
            printThird.run();
            notifyAll();
        }


    }
}
