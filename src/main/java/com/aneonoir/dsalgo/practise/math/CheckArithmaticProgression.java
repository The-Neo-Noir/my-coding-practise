package com.aneonoir.dsalgo.practise.math;

/**
 * link: https://app.codesignal.com/challenge/s4AfxmEgtJdA9ANJr
 * <p>
 * soulution: brueteforce
 * <p>
 * tags: math,array
 * <p>
 * TODO: see the solution and check if you can do it in any more optimally , may be less code
 */
public class CheckArithmaticProgression {

    boolean isArithmeticProgression(int[] sequence) {
        int difference = sequence[1] - sequence[0];
        boolean result = false;
        for (int i = 1; i < sequence.length - 1; i++) {
            if (difference != sequence[i + 1] - sequence[i]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

}
