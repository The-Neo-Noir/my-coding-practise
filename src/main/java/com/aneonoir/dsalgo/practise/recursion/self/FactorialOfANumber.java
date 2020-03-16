package com.aneonoir.dsalgo.practise.recursion.self;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int factorial = factorial(0);
        System.out.println(factorial);

    }

    private static int factorial(int i) {
        if(i==0){
            return 1;
        }else{
            return i*factorial(i-1);
        }
    }
}
