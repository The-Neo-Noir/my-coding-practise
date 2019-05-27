package com.aneonoir.dsalgo.practise.array;

/**
 * link: https://app.codesignal.com/arcade/code-arcade/well-of-integration/x3ix7CY93z2bwKDtG/solutions
 * <p>
 * TODO: see better solutions
 */
public class SwitchLights {

    int[] switchLights(int[] a) {

        if (a[0] == 1) {
            a[0] = 0;
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i] == 1) {
                for (int j = i; j >= 0; j--) {
                    a[j] = (a[j] == 1 ? 0 : 1);
                }
            }
        }
        return a;
    }

}
