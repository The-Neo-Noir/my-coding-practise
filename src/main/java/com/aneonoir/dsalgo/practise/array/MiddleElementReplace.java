package com.aneonoir.dsalgo.practise.array;

import org.junit.Test;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/list-forest-edge/APD5T5CybxTtfkdjL
 * <p>
 * Stuggle: replacingthe middle element was a struggle
 */
public class MiddleElementReplace {

    @Test
    public void Test() {
        int[] ints = replaceMiddle(new int[]{2, 8});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }

    int[] replaceMiddle(int[] arr) {
        int middleElement = arr.length % 2 == 0 ? arr[arr.length / 2] + arr[(arr.length / 2) - 1] : arr[arr.length - 2];
        if (arr.length % 2 == 0) {
            int result[] = new int[arr.length - 1];
            int counter = 0;
            boolean isFirst = true;
            result[result.length / 2] = middleElement;
            for (int i = 0; i < result.length; i++) {
                if (i < result.length / 2)//first half
                {
                    result[i] = arr[i];
                } else if (i == result.length / 2) {
                    // do nothing;
                } else {
                    result[i] = arr[i + 1];
                } // second half

            }
            return result;
        } else {
            return arr;
        }
    }
}
