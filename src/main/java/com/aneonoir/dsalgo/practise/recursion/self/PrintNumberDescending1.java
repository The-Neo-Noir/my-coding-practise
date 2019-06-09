package com.aneonoir.dsalgo.practise.recursion.self;

/**
 * link: self: 1
 * <p>
 * Notes: understand what is return ? do you need it ?
 * . Understand the effect of  s.o.p before and after call at 20
 * . understand what happens when you do i-- instead of i-1
 * <p>
 * Excercise:
 * 1. Print the number in ascending order
 * 2. Print every even number  in ascending order
 */
public class PrintNumberDescending1 {

    public static void main(String[] args) {
        recursivePrintDesceding(6);
        recursivePrintAscending(6);

    }

    private static void recursivePrintAscending(int i) {
        if (i == 0) {
            return;
        } else {
            recursivePrintAscending(i - 1);
            System.out.println(i);
        }
        // can we change this code to below and it still works?
        /*if(i!=0){
            recursivePrintAscending(i-1);
            System.out.println(i);
        }*/
    }


    private static void recursivePrintDesceding(int i) {
        if (i == 0) {
            return;
        } else {
            System.out.println(i);
            recursivePrintDesceding(i - 1);
        }
    }

}

