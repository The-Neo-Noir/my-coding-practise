package com.aneonoir.dsalgo.practise.recursion.self;

public class MultiPlyingWithOutOperator {
    public static void main(String[] args) {
        int i = 5, j = 0;
        int result = 0;
        for (int k = 0; k < j; k++) {
            result = result + i;
        }
        System.out.println(recursiveMul(5, 2));

    }

    static int recursiveMul(int i, int j) {
        //stopping condition
        if (j == 0) {
            return 0;
        } else {
            return i + recursiveMul(i, j - 1);
        }
        //recursive situation

    }
}
