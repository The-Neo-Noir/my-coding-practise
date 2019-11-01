package com.aneonoir.dsalgo.practise.sorting;

/**
 * https://practice.geeksforgeeks.org/problems/wave-array/0
 * Sort array in a wave pattern
 * TODO: timed out , optmization is necessary, this solution is o(n2)
 *
 * A neat solution is at https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form-set-2-o1-extra-space/
 *
 *
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class WaveSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbOfTestCases = sc.nextInt();
        for (int i = 0; i < numbOfTestCases; i++) {
            int items = sc.nextInt();
            int[] input = new int[items];
            for (int j = 0; j < items; j++) {
                input[j] = sc.nextInt();
            }
            wavesort(input);
            for (int j = 0; j < items; j++) {
                System.out.print(input[j] + " ");
            }
            System.out.println();
        }
    }

    public static void wavesort(int[] input) {
        //case 2
        // case 3
        // case 4
        if (input.length == 0 || input.length == 1) {
            return;
        } else {
            int bigIndex = 0;
            int littleIndex = 1;
            for (int i = 0; i < input.length; i++) {
                if (i % 2 == 0) {
                    int max = input[bigIndex];
                    int candidateForSwap = bigIndex;
                    for (int j = bigIndex + 1; j < input.length; j++) {
                        if (max < input[j]) {
                            candidateForSwap = j;
                            max = input[j];
                        }
                    }
                    if (candidateForSwap != bigIndex) {
                        int temp = input[bigIndex];
                        input[bigIndex] = input[candidateForSwap];
                        input[candidateForSwap] = temp;
                    }
                    bigIndex = bigIndex + 2;
                } else {
                    int min = input[littleIndex];
                    int candidateForSwap = littleIndex;
                    for (int j = littleIndex + 1; j < input.length; j++) {
                        if (min > input[j]) {
                            candidateForSwap = j;
                            min = input[j];
                        }
                    }
                    if (candidateForSwap != littleIndex) {
                        int temp = input[littleIndex];
                        input[littleIndex] = input[candidateForSwap];
                        input[candidateForSwap] = temp;
                    }
                    littleIndex = littleIndex + 2;
                }
            }
        }

    }
}
