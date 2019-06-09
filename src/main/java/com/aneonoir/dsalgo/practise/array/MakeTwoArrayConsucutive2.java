package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-forest-edge/bq2XnSr5kbHqpHGJC
 */
public class MakeTwoArrayConsucutive2 {
    int makeArrayConsecutive2(int[] statues) {
        int min = statues[0], max = statues[0];
        for (int i = 1; i < statues.length; i++) {
            if (statues[i] > max) {
                max = statues[i];
            }
            if (statues[i] < min) {
                min = statues[i];
            }
        }
        return ((max - min) + 1) - statues.length;
    }
}
