package com.aneonoir.dsalgo.practise.threads;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class ProducerConsumerProblem {

    class FizzBuzz {
        private int n;

    public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            if(this.n%3==0){
                System.out.print("fizz, ");
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            if(this.n%5==0){
                System.out.print("buzz, ");
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            if(this.n%3==0 &&  this.n%5==0){
                System.out.print("fizzbuzz, ");
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
          printNumber.accept(n);
        }
    }
    public static void main(String[] args) {


        ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();

        Thread  producerThread= new Thread(new Runnable() {
            @Override
            public void run() {
                producerAndConsumer.produce();

            }
        },"Producer");

        Thread  consumerThread= new Thread(new Runnable() {
            @Override
            public void run() {
                producerAndConsumer.consume();
            }
        },"Consumer");



        producerThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        consumerThread.start();

    }
}

class ProducerAndConsumer {
    private LinkedList<Brick> list = new LinkedList<Brick>();
    private Random r = new Random();
    int limit=10;

    public synchronized void produce() {
        while (true) {
            while (list.size() == limit) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            list.add(new Brick(r.nextInt()));
            notify();

        }
    }

    public synchronized void consume() {

        while (true) {
            while (list.size()==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Brick remove = list.remove();
            System.out.println(remove);
            notify();

        }

    }

    private class Brick {
        int number;

        public Brick(int number) {
            this.number = number;
        }
    }
}

