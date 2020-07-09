package com.aneonoir.dsalgo.practise.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * link: https://leetcode.com/problems/print-foobar-alternately/submissions/
 *
 * TODO: try differnt other ways you can .
 *
 * tag: must-do-interview , threads, medium
 *
 */
public class FooBar {
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    AtomicInteger ins = new AtomicInteger(0);

    public void foo(Runnable printFoo) throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < n; i++) {
                while (ins.get() % 2 != 0) {
                    wait();
                }
                printFoo.run();
                ins.getAndIncrement();
                notify();
            }
        }

    }

    public void bar(Runnable printBar) throws InterruptedException {
        synchronized (this) {
            for (int i = 0; i < n; i++) {
                while (ins.get() % 2 == 0) {
                    wait();
                }
                printBar.run();
                ins.getAndIncrement();
                notify();
            }
        }
    }
}
