package com.aneonoir.dsalgo.practise.array;

/**
 * Source Link: https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/
 * <p>
 * Stuggle:No
 * <p>
 * Tags: array,hash
 */

public class FindThePairWithGivenDifference {
    public static void main(String[] args) {

        int arr[] = {5, 20, 3, 2, 50, 80};
        int differenceRequired = 78;

        findThePairWithGivenDifference(arr, differenceRequired);
    }

    // A bruteforce method
    private static void findThePairWithGivenDifference(int[] arr, int differenceRequired) {

        for (int i = 0; i < arr.length - 1; i++) {
            int currentNumber = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(currentNumber - arr[j]) == differenceRequired) {
                    System.out.println("Match found : " + currentNumber + " " + arr[j]);
                }
            }
        }
    }

}
