package com.aneonoir.dsalgo.practise.array;

import java.util.ArrayList;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/sorting-outpost/s4BEFMcpLdGbjX9KX
 */
public class ShuffledArray {
    int[] shuffledArray(int[] shuffled) {
        int indexFound = -1;
        for (int i = 0; i < shuffled.length; i++) {
            int currentSum = 0;
            int element = shuffled[i];
            for (int j = 0; j < shuffled.length; j++) {
                if (i != j) {
                    currentSum += shuffled[j];
                }
            }
            if (currentSum == element) {
                indexFound = i;
            }
        }
        int[] result = new int[shuffled.length - 1];
        ArrayList<Integer> list = new ArrayList<>(shuffled.length - 1);
        for (int i = 0; i < shuffled.length; i++) {
            if (i != indexFound) {
                list.add(new Integer(shuffled[i]));
            }
        }
        list.sort((o1, o2) -> o1.compareTo(o2));
        int i=0;
        for (Integer integer : list) {
            result[i++]=integer;
        }
        return result;
    }

}
