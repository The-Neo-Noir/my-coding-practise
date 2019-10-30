package com.aneonoir.dsalgo.practise.recursion.self;

public class Print1ToN {

    public static void main(String[] args) {
        //nonRecursive(5);
        recursive(5);
    }

    private static void recursive(int i) {
        if (i != 0) {
            recursive(i - 1);
            System.out.println(i);
        }

    }

    private static void nonRecursive(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
}
