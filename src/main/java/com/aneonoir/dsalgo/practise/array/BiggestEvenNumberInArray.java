package com.aneonoir.dsalgo.practise.array;

import java.util.stream.IntStream;

/**
 * link: https://app.codesignal.com/challenge/zYZabzDcnj3yigSnB
 * <p>
 * Solution approach: pretty straight forward.
 * <p>
 * Solve it using iteration and functional in java
 */
public class BiggestEvenNumberInArray {


    public int biggestEvenNumberIteration(int[] input) {
        int biggestInteger = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0 && input[i] >= biggestInteger) {
                biggestInteger = input[i];
            }
        }
        return biggestInteger;
    }

    public int biggestEvenNumberFunctional(int[] input) {
        return IntStream.of(input).filter(value -> value % 2 == 0).max().getAsInt();
    }
}
