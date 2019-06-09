package com.aneonoir.dsalgo.practise.recursion.self;

/**
 * Link:
 */
public class PrintStringReverse {

    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b', 'c', 'd'};
        printStringInReverseOrder(3, chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    private static void swap(char[] o) {
        char temp = o[0];
        o[0] = o[1];
        o[1] = temp;
    }

    private static void printStringInReverseOrder1(int index, char[] o) {
        if (index == -1) {
            return;
        } else {
            System.out.println(o[index]);
            printStringInReverseOrder(index - 1, o);
        }
    }

    //* First attempt, it did not work ?
    private static void printStringInReverseOrder(int index, char[] o) {
        if (index == o.length / 2 - 1) {
            return;
        } else {
            //System.out.println(o[index]);
            printStringInReverseOrder(index - 1, o);
            char temp = o[index];
            o[index] = o[o.length - 1 - index];
            o[o.length - 1 - index] = temp;

        }
    }


    // Follow up , can you modify the same

}
//| index=2,() |
//   |index=1,()1,2-1|
//      |index=0,(),2-0, |
//        |index=-1,()|
