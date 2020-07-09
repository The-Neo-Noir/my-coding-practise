package com.aneonoir.dsalgo.practise.threads;

import java.util.function.IntConsumer;

public class FizzBuzzMultiThreaded {

    public static void main(String[] args) {
        FizzBuzzC fizzBuzz = new FizzBuzzC(5);
        Fizz f = new Fizz(fizzBuzz);
        Buzz b = new Buzz(fizzBuzz);
        // FizzBuzz fb = new FizzBuzz(fizzBuzz);
        Number number = new Number(fizzBuzz);


        //   fb.start();
        number.start();
        f.start();
        b.start();

    }
}

class Fizz extends Thread {
    FizzBuzzC f;

    public Fizz(FizzBuzzC f) {
        super("fizz");
        this.f = f;
    }

    public void run() {
        try {
            f.fizz(new Runnable() {
                @Override
                public void run() {
                    System.out.print("fizz, ");
                }
            });


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Buzz extends Thread {
    FizzBuzzC f;

    public Buzz(FizzBuzzC f) {
        super("buzz");
        this.f = f;
    }

    public void run() {
        try {
            f.buzz(new Runnable() {
                @Override
                public void run() {
                    System.out.print("buzz, ");
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//class FizzBuzz extends Thread {
//    FizzBuzzC f;
//
//    public FizzBuzz(FizzBuzzC f) {
//        super("fizzbuzz");
//        this.f = f;
//    }
//    public void run(){
//        try {
//          //  f.fizzbuzz(this);
//            System.out.print("fizzbuzz, ");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
class Number extends Thread {
    FizzBuzzC f;

    public Number(FizzBuzzC f) {
        super("num");
        this.f = f;
    }

    public void run() {
        try {
            f.number(value -> System.out.print(value + ", "));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class FizzBuzzC {
    private int n;


    public FizzBuzzC(int n) {

        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 != 0) wait();
                if (i % 3 == 0 && i % 3 != 5) {
                    printFizz.run();
                }
                notifyAll();
            }

        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (this) {
            synchronized (this) {
                for (int i = 1; i <= n; i++) {
                    if (i % 5 != 0) wait();
                    if (i % 5 == 0 && i % 3 != 0) {
                        printBuzz.run();
                    }
                    notifyAll();
                }

            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
//    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
//        synchronized (this){
//            while(start<n){
//                start++;
//                notifyAll();
//            }
//
//        }
//        synchronized (this) {
//            while (start < n) {
//                while (start % 5 != 0 && start % 3 != 0) {
//                    wait();
//                }
//                if (start % 5 == 0 && start % 3 == 0) {
//                    printFizzBuzz.run();
//                }
//                start++;
//                notifyAll();
//            }
//        }


    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                if (i % 5 == 0 || i % 3 == 0) {
                    wait();
                }
                if (i % 5 != 0 & i % 3 != 0) {
                    printNumber.accept(i);
                }
                notifyAll();
            }
        }
    }
}
