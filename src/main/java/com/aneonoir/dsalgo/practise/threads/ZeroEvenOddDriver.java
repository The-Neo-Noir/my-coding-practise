package com.aneonoir.dsalgo.practise.threads;

import java.util.function.IntConsumer;

class Zero implements Runnable {
    ZeroEvenOdd zeroEvenOdd;

    public Zero(ZeroEvenOdd evenOdd) {
        this.zeroEvenOdd = evenOdd;
    }

    @Override
    public void run() {
        try {
            zeroEvenOdd.zero(value -> System.out.print(value));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Odd implements Runnable {
    ZeroEvenOdd zeroEvenOdd;

    public Odd(ZeroEvenOdd evenOdd) {
        this.zeroEvenOdd = evenOdd;
    }

    @Override
    public void run() {
        try {
            zeroEvenOdd.odd(value -> System.out.print(value));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Even implements Runnable {
    ZeroEvenOdd zeroEvenOdd;

    public Even(ZeroEvenOdd evenOdd) {
        this.zeroEvenOdd = evenOdd;
    }

    @Override
    public void run() {
        try {
            zeroEvenOdd.even(value -> System.out.print(value));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ZeroEvenOddDriver {
    public static void main(String[] args) {
        ZeroEvenOdd z = new ZeroEvenOdd(3);
        Thread threadZero = new Thread(new Zero(z), "Zero");
        Thread threadEven = new Thread(new Even(z), "Even");
        Thread threadOdd = new Thread(new Odd(z), "Odd");

        threadEven.start();
        threadOdd.start();
        threadZero.start();

    }
}

class ZeroEvenOdd {


    private int n;
    private volatile int start = 1;

    private volatile boolean print = false;
    private volatile boolean waiting = false;
    private Object lock = new Object();

    public ZeroEvenOdd(int n) {
        this.n = n;

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (start < n) {
                while (!waiting) {
                    wait();
                }
                printNumber.accept(0);
                notifyAll();
                print = true;
                waiting = false;
            }
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {

        synchronized (this) {
            while (start < n) {
                while (start % 2 != 0) {
                    wait();
                }
                if(!print) waiting = true;
                while (!print) {
                    wait();
                }
                print = false;
                printNumber.accept(start);
                notifyAll();
                start++;
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            while (start < n) {
                while (start % 2 == 0) {
                    wait();
                }
                if(!print) waiting = true;
                while (!print) {
                    wait();
                }
                print = false;
                printNumber.accept(start);
                notifyAll();
                start++;
            }
        }
    }
}