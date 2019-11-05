package com.aneonoir.dsalgo.practise.strings;

import java.util.Scanner;

/**
 * link: https://practice.geeksforgeeks.org/problems/special-array-reversal/0
 * <p>
 * interview
 * tag: string
 */
public class SpecialStringReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases > 0) {
            System.out.println(call(sc.next()));
            cases--;
        }
    }

    // ab#
    //ac#b
    private static String call(String asdf) {
        int endPointer = asdf.length() - 1;
        int startPointer = 0;
        char arr[] = asdf.toCharArray();
        while (startPointer < endPointer) {
            if (Character.isAlphabetic(arr[endPointer]) && Character.isAlphabetic(arr[startPointer])) {
                char temp = arr[endPointer];
                arr[endPointer] = arr[startPointer];
                arr[startPointer] = temp;
                startPointer++;
                endPointer--;
            } else if (!Character.isAlphabetic(arr[endPointer])) {
                endPointer--;
            } else {
                startPointer++;
            }
        }
        return new String(arr);

    }

}
