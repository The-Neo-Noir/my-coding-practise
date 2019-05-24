package com.aneonoir.dsalgo.practise.array;

/**
 * link= https://app.codesignal.com/arcade/code-arcade/spring-of-integration/MQg7s3dKrP4caN42A/solutions
 * <p>
 * TODO: follow up question:  don't use additional space.
 */
public class ArrayPreviousLeft {

    int[] arrayPreviousLess(int[] items) {

        int result[] = new int[items.length];
        result[0] = -1;
        for (int i = 1; i < items.length; i++) {
            boolean isFound = false;
            for (int j = i - 1; j >= 0; j--) {
                if (items[i] > items[j]) {
                    result[i] = items[j];
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                result[i] = -1;
            }
        }
        return result;
    }

}
