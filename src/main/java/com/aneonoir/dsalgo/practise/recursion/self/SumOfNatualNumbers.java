package com.aneonoir.dsalgo.practise.recursion.self;

public class SumOfNatualNumbers {

    public static void main(String[] args) {
        System.out.println(sum(5));

    }

    private static int sum(int i) {
        if(i==1){
            return 1;
        }else{
            return i+sum(i-1);
        }
    }
}

